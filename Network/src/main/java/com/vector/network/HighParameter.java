package com.vector.network;

import java.util.ArrayList;
import java.util.List;

import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;

/**
 *
 * 感觉这个就是垃圾，无服务说一定要用application/x-www-form-urlencoded;charset=utf-8
 * 发出请求才不会出现乱码，我也是醉了
 *
 *
 * Author: vector.huang
 * Email: 642378415@qq.com
 * Date: 2015/10/15
 * Description:<p>{TODO: 用一句话描述}
 */
public class HighParameter {
    private static final char[] HEX_DIGITS =
            {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";

    private final List<String> param = new ArrayList<String>();
    private final Buffer mContent = new Buffer();

    /**
     * 添加一个参数
     * @param key
     * @param value
     * @return
     */
    public HighParameter add(String key, String value){
        param.add(key);
        param.add(value);
        if (mContent.size() > 0) {
            mContent.writeByte('&');
        }
        canonicalize(mContent, key, 0, key.length(),
                FORM_ENCODE_SET, false, true,false, false);
        mContent.writeByte('=');
        canonicalize(mContent, value, 0, value.length(),
                FORM_ENCODE_SET, false, true,false, false);
        return this;
    }

    /**
     * 发出
     * @return
     */
    RequestBody getRequestBody(){
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/x-www-form-urlencoded;charset=utf-8"),
                mContent.snapshot());
        return requestBody;
    }

    /**
     * e.g key=value&key=value
     * @return key=value&key=value
     */
    String toParameter() {
        return mContent.readUtf8();
    }

    void addTo(HttpUrl.Builder builder){
        for (int i = 0; i < param.size(); i += 2) {
            builder.addQueryParameter(param.get(i),param.get(i+1));
        }
    }

    /**
     * e.g key=value&key=value
     * @return key=value&key=value
     * @return
     */
    @Override
    public String toString() {
        return toParameter();
    }

    static void canonicalize(Buffer out, String input, int pos, int limit, String encodeSet,
                             boolean alreadyEncoded, boolean strict, boolean plusIsSpace, boolean asciiOnly) {
        Buffer utf8Buffer = null; // Lazily allocated.
        int codePoint;
        for (int i = pos; i < limit; i += Character.charCount(codePoint)) {
            codePoint = input.codePointAt(i);
            if (alreadyEncoded
                    && (codePoint == '\t' || codePoint == '\n' || codePoint == '\f' || codePoint == '\r')) {
                // Skip this character.
            } else if (codePoint == '+' && plusIsSpace) {
                // Encode '+' as '%2B' since we permit ' ' to be encoded as either '+' or '%20'.
                out.writeUtf8(alreadyEncoded ? "+" : "%2B");
            } else if (codePoint < 0x20
                    || codePoint == 0x7f
                    || codePoint >= 0x80 && asciiOnly
                    || encodeSet.indexOf(codePoint) != -1
                    || codePoint == '%' && (!alreadyEncoded || strict && !percentEncoded(input, i, limit))) {
                // Percent encode this character.
                if (utf8Buffer == null) {
                    utf8Buffer = new Buffer();
                }
                utf8Buffer.writeUtf8CodePoint(codePoint);
                while (!utf8Buffer.exhausted()) {
                    int b = utf8Buffer.readByte() & 0xff;
                    out.writeByte('%');
                    out.writeByte(HEX_DIGITS[(b >> 4) & 0xf]);
                    out.writeByte(HEX_DIGITS[b & 0xf]);
                }
            } else {
                // This character doesn't need encoding. Just copy it over.
                out.writeUtf8CodePoint(codePoint);
            }
        }
    }

    static boolean percentEncoded(String encoded, int pos, int limit) {
        return pos + 2 < limit
                && encoded.charAt(pos) == '%'
                && decodeHexDigit(encoded.charAt(pos + 1)) != -1
                && decodeHexDigit(encoded.charAt(pos + 2)) != -1;
    }

    static int decodeHexDigit(char c) {
        if (c >= '0' && c <= '9') return c - '0';
        if (c >= 'a' && c <= 'f') return c - 'a' + 10;
        if (c >= 'A' && c <= 'F') return c - 'A' + 10;
        return -1;
    }
}
