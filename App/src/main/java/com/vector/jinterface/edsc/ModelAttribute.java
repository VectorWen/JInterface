package com.vector.jinterface.edsc;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * author: vector.huang
 * date：2016/5/24 10:36
 */
public class ModelAttribute {

    /* 表名 */
    private String tableName;
    /* 字段：类型-字段名 */
    private Map<String,Class> fields;
    /* 主键 ： 一定是int 类型 */
    private String primaryKey;

    @Override
    public String toString() {
        return "tableName = "+tableName+";"+"primaryKey = "+primaryKey +";"+ fields;
    }

    public void addField(Class cls, String field){
        if(fields == null){
            fields = new HashMap<>();
        }
        fields.put(field,cls);
    }

    public Map<String,Class> getFields() {
        return fields;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }
}
