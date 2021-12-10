package com.company;

import com.company.task1.ConcreteFactory;
import com.company.task2.ChairFactory;
import com.company.task2.Person;
import com.company.task2.interfaces.AbstractChairFactory;
import com.company.task2.interfaces.Chair;

public class Main {

    public static void main(String[] args) {
        var p = new Person();

        AbstractChairFactory factory = new ChairFactory();
        Chair magicChair = factory.createMagicChair();
        Chair functional = factory.createFunctionalChair();

        p.setChair(magicChair);
        p.Sit(magicChair);
        p.setChair(functional);
        p.Sit(functional);
    }
}