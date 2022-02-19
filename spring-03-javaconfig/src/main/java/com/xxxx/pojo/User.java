package com.xxxx.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class User {

    @Autowired
    Cat cat;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
}
