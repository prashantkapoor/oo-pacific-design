package com.pacific.creational.factory.model;

public abstract class Car {

    String registrationNo;

    public void testDrive(){
        System.out.println("Driver is driving the car");
    }
    public void ensureQualityCheck(){
        System.out.println("Car quality check complete");
    }
}
