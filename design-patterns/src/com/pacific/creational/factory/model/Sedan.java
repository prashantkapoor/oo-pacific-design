package com.pacific.creational.factory.model;

import com.pacific.creational.factory.model.Car;

public class Sedan extends Car {

    public void testDrive(){
        System.out.println("Driver is testing and bringing the Sedan");
    }
    public void ensureQualityCheck(){
        System.out.println("Sedan quality check complete");
    }
}
