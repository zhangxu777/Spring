package com.xxxx.service.impl;

import com.xxxx.service.SomeService;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, Integer age) {
        System.out.println("Print doSome");
    }
}
