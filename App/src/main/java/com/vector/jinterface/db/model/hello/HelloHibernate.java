package com.vector.jinterface.db.model.hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * author: vector.huang
 * date：2016/3/30 10:15
 */
@Entity
@Table(name = "HelloHibernate", schema = "dbo", catalog = "KoudaiDBV19")
public class HelloHibernate {

    private int id;
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
