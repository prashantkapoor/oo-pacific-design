package com.pacific.creational.factory.model;

import com.pacific.creational.factory.model.Car;

public class HatchBack extends Car {

    public void testDrive(){
        System.out.println("Driver is testing and bringing the Hatchback");
    }
    public void ensureQualityCheck(){
        System.out.println("Hatchback quality check complete");
    }
}
