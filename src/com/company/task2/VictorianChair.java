package com.company.task2;

import com.company.task2.interfaces.Chair;


public class VictorianChair implements Chair {

    private final int age;


    public VictorianChair(int age) {
        this.age = age;
    }


    public int getAge() {
        return age;
    }
}