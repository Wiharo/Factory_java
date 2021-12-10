package com.company.task2.interfaces;

import com.company.task2.FunctionalChair;
import com.company.task2.MagicChair;
import com.company.task2.VictorianChair;


public interface AbstractChairFactory {

    VictorianChair createVictorianChair();
    MagicChair createMagicChair();
    FunctionalChair createFunctionalChair();
}