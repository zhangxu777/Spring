package com.xxxx.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.Connection;

public class Temp {

    public String abc;

    @Autowired
    Cat cat1;

    public Cat getCat() {
        return cat1;
    }

    public void setCat(Cat cat1) {
        this.cat1 = cat1;
    }



    @Override
    public String toString() {
        return "Temp{" +
                "temp='" + abc + '\'' +
                '}';
    }

    public String getTemp() {
        return abc;
    }

    @Value("ZXZXZX")
    public void setTemp(String abc) {
        this.abc = abc;
    }

}
