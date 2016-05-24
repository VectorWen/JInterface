package com.vector.jinterface.edsc;

import com.vector.jinterface.edsc.helper.VClass;

import java.util.Map;

/**
 * Dao 工厂，用来生成Model类的
 * author: vector.huang
 * date：2016/5/24 9:58
 */
public class DaoFactory {
    private String packageName = "com.zyt.kdhk.dao.channel";
    private String importClass = "import javax.persistence.Entity;\n" +
            "import javax.persistence.GeneratedValue;\n" +
            "import javax.persistence.Id;\n" +
            "import javax.persistence.Table;";

    private String classNote = "/**\n" +
            " * @author vector.huang\n" +
            " * @date 2016/5/24\n" +
            " */\n" +
            "@Entity\n" +
            "@Table(name = \"{tableName}\", schema = \"dbo\", catalog = \"KoudaiDBV19\")";

    private String className = "";

    public String create(ModelAttribute modelAttribute) {
        VClass vClass = new VClass();
        vClass.setPackageName(packageName);
        vClass.addImportClass(importClass);
        vClass.setClassNote(classNote.replace("{tableName}", modelAttribute.getTableName()));

        String[] classNames = modelAttribute.getTableName().split("_");
        vClass.setClassName(classNames.length == 1 ? classNames[0] : classNames[classNames.length - 1]);

        vClass.setClassBody(getBody(modelAttribute));

        return vClass.string();
    }

    private String getBody(ModelAttribute modelAttribute) {
        StringBuilder builder = new StringBuilder();

        Map<String, Class> fields = modelAttribute.getFields();

        builder.append("    private int ").append(modelAttribute.getPrimaryKey())
                .append(";\n");

        fields.forEach((field, cls) -> {
            builder.append("    private ").append(cls.getSimpleName()).append(" ")
                    .append(field).append(";\n");
        });

        builder.append(GetterSetter.create(modelAttribute.getPrimaryKey(), int.class
                , "@Id\n" +
                        "@GeneratedValue"));
        builder.append("\n");

        fields.forEach((field, cls) -> {
            builder.append(GetterSetter.create(field, cls));
            builder.append("\n");
        });
        return builder.toString();
    }


}
