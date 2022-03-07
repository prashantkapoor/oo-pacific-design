package com.pacific.creational.factory;

import com.pacific.creational.factory.factorymethod.CarFactory;
import com.pacific.creational.factory.model.Car;
import com.pacific.creational.factory.model.CarType;

public class CarDealer {

    SimpleFactory carFactory=new SimpleFactory();

    CarFactory factory;

    public CarDealer(CarFactory factory){
        this.factory=factory;
    }

    /**
     * Using Simple factory
     * @param type
     * @return
     */
    public Car orderCar(CarType type){
        return carFactory.manufacture(type);
    }

    /**
     * Using Factory Pattern
     * @return
     */
    public Car orderCar(){
        return factory.manufacture();
    }
}
