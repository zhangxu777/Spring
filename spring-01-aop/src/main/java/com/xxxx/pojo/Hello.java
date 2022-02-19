package com.xxxx.pojo;

public class Hello {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;


    public void say(){


        System.out.println(name);
        System.out.println("First Spring Program");
    }
}
