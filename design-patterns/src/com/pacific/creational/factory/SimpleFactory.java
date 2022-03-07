package com.pacific.creational.factory;

import com.pacific.creational.factory.model.Car;
import com.pacific.creational.factory.model.CarType;
import com.pacific.creational.factory.model.HatchBack;
import com.pacific.creational.factory.model.Sedan;

public class SimpleFactory {

    public Car manufacture(CarType type) {
        if(type==CarType.HATCHBACK){
            return new HatchBack();
        }else if(type==CarType.SEDAN){
            return new Sedan();
        }
        return null;
    }
}
