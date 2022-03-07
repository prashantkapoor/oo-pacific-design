package com.pacific.creational.factory.factorymethod;

import com.pacific.creational.factory.model.CarType;
import com.pacific.creational.factory.model.Car;

public interface CarFactory {

    Car create();
    default Car manufacture(){
     Car car=create();
     car.ensureQualityCheck();
     car.testDrive();

     return car;
    }
}
