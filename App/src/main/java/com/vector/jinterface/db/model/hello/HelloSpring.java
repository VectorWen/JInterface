package com.vector.jinterface.db.model.hello;

import org.springframework.stereotype.Component;

/**
 *
 *
 * author: vector.huang
 * date：2016/3/30 9:31
 */
@Component
public class HelloSpring {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
