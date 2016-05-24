package com.vector.jinterface.edsc.helper;

import java.util.ArrayList;
import java.util.List;

/**
 * 一个类
 * author: vector.huang
 * date：2016/5/24 9:18
 */
public class VClass {

    /* 包名 */
    private String packageName;
    /* 类的Scope : public static final*/
    private String classScope = "public";
    /* 类名 */
    private String className;
    /* 需要导入的类 */
    private List<String> importClasses;
    /* 类注释 */
    private String classNote;
    /* 类体 */
    private String classBody;

    public String string() {
        StringBuffer buffer = new StringBuffer();

        /* 包名 */
        buffer.append("package ").append(packageName).append(";").append("\n\n");

        /* 导入的类 */
        for (String importClass : importClasses) {
            buffer.append(importClass).append(";").append("\n");
        }
        buffer.append("\n");

        /* 注释 */
        buffer.append(classNote).append("\n");

        /* 类名 */
        buffer.append(classScope).append(" class ").append(className).append(" {").append("\n");

        /* 类体 */
        buffer.append(classBody);

        buffer.append("}");

        return buffer.toString();
    }

    public void addImportClass(String importClass){
        if(importClasses == null){
            importClasses = new ArrayList<>();
        }
        importClasses.add(importClass);
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getClassScope() {
        return classScope;
    }

    public void setClassScope(String classScope) {
        this.classScope = classScope;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<String> getImportClasses() {
        return importClasses;
    }

    public void setImportClasses(List<String> importClasses) {
        this.importClasses = importClasses;
    }

    public String getClassNote() {
        return classNote;
    }

    public void setClassNote(String classNote) {
        this.classNote = classNote;
    }

    public String getClassBody() {
        return classBody;
    }

    public void setClassBody(String classBody) {
        this.classBody = classBody;
    }
}
