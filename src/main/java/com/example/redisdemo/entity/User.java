package com.example.redisdemo.entity;


import java.io.Serializable;


public class User implements Serializable {

    private static final long serialVersionUID = 8845692289344151390L;
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
