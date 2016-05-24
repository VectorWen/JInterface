package com.vector.jinterface.edsc;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * author: vector.huang
 * date：2016/5/24 11:21
 */
public class SqlParse {


    public List<ModelAttribute> parse(String sql){
        return parseToModelAttribute(parseToTableCreated(sql));
    }

    /* 将最初的sql 解析出表名和字段名 */
    private List<String> parseToTableCreated(String sql) {
        List<String> creates = new ArrayList<>();

        String[] s = sql.split("CREATE TABLE ");
        for (int i = 1; i < s.length; i = i + 2) {
            String create = s[i];
            creates.add(create.trim().split("PRIMARY KEY CLUSTERED")[0].trim());
        }
        return creates;
    }

    private List<ModelAttribute> parseToModelAttribute(List<String> creates){
        List<ModelAttribute> modelAttributes = new ArrayList<>();

        for (String sql : creates){
            modelAttributes.add(parseToModelAttribute(sql));
        }

        return modelAttributes;
    }

    private ModelAttribute parseToModelAttribute(String sql){
        ModelAttribute modelAttribute = new ModelAttribute();
        String[] attrs = sql.split("\n");
        int i = 0;
        /* 第一个是tableName */
        String[] twe = parseLine(attrs[i], 2);
        modelAttribute.setTableName(twe[1]);
        i++;

        /* 第二个是主键 */
        twe = parseLine(attrs[i], 1);
        modelAttribute.setPrimaryKey(twe[1]);
        i++;

        /* 下面的是字段 */
        for (; i < attrs.length; i++) {
            twe = parseLine(attrs[i], 1);
            modelAttribute.addField(parseType(twe[1]),twe[0]);
        }

        return modelAttribute;
    }

    /* 解析一行数据 */
    private String[] parseLine(String attr, int subStart) {
        String[] twe = attr.split("]");
        twe[0] = twe[0].trim().substring(1);
        twe[1] = twe[1].trim().substring(subStart);
        return twe;
    }

    private Class parseType(String dateType){
        switch (dateType){
            case "int":
                return int.class;
            case "bigint":
                return long.class;
            case "float":
                return float.class;
            case "nvarchar":
            case "ntext":
                return String.class;
            case "datetime":
                return Date.class;
            default:
                try {
                    throw new ClassNotFoundException(dateType);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                return String.class;
        }
    }

}
