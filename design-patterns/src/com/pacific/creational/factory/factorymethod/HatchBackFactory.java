package com.pacific.creational.factory.factorymethod;

import com.pacific.creational.factory.model.CarType;
import com.pacific.creational.factory.model.Car;
import com.pacific.creational.factory.model.HatchBack;

public class HatchBackFactory implements CarFactory{
    @Override
    public Car create() {
        return new HatchBack();
    }
}
