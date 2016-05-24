package com.vector.jinterface.edsc;

/**
 * author: vector.huang
 * date：2016/5/24 11:39
 */
public class GetterSetter {

    private static final String temp = "    public {dataType} get{Field}() {\n" +
            "        return {field};\n" +
            "    }\n" +
            "\n" +
            "    public void set{Field}({dataType} {field}) {\n" +
            "        this.{field} = {field};\n" +
            "    }";

    private static final String booleanTemp = "    public boolean is{Field}() {\n" +
            "        return {field};\n" +
            "    }\n" +
            "\n" +
            "    public void set{Field}(boolean {field}) {\n" +
            "        this.{field} = {field};\n" +
            "    }";

    public static String create(String field, Class dateType) {
        return create(field, dateType, null);
    }

    public static String create(String field, Class dateType, String annotation) {
        String nowTemp = temp;
        if (boolean.class == dateType) {
            nowTemp = booleanTemp;
        }

        String up = field.substring(0, 1).toUpperCase() + field.substring(1);
        String result = nowTemp.replace("{Field}", up)
                .replace("{field}", field)
                .replace("{dataType}", dateType.getSimpleName());

        if (annotation != null && !annotation.isEmpty()) {
            return "    " + annotation.replace("\n", "\n    ") + "\n" + result;
        }
        return result;
    }
}
