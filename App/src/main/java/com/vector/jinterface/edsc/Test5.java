package com.vector.jinterface.edsc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * author: vector.huang
 * date：2016/5/24 12:09
 */
public class Test5 {
    public static void main(String[] args) {
        List<ModelAttribute> modelAttributes = new SqlParse().parse(Test3.sql);
        ModelFactory factory = new ModelFactory();
        modelAttributes.forEach(modelAttribute -> {
            String model = factory.create(modelAttribute);
            try {
                String[] classNames = modelAttribute.getTableName().split("_");
                Path path = Paths.get("d:","model",classNames.length == 1 ?
                        classNames[0] : classNames[classNames.length - 1]+".java");
                Files.createFile(path);
                Files.write(path
                        ,model.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
