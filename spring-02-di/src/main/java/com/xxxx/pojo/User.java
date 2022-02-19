package com.xxxx.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("user")
public class User {

    @Autowired
    private Cat cat;

    private Dog dog;
    public String str;

    @Override
    public String toString() {
        return "User{" +
                "str='" + str + '\'' +
                '}';
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }


    public String getStr() {
        return str;
    }

    @Value("XXXX")
    public void setStr(String str) {
        this.str = str;
    }
}
