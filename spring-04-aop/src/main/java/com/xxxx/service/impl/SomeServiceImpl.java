package com.xxxx.service.impl;

import com.xxxx.service.SomeService;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, Integer age) {
        System.out.println("Print doSome");
    }

    @Override
    public String doOther() {
        System.out.println("Pring doOther");
        return "abcd";
    }

    @Override
    public String doAround(String name) {
        System.out.println("Print SomeService doAround");
        return "SomeService return doAround";
    }


}
