package com.pacific.creational.abstractfactory;

import com.pacific.creational.abstractfactory.factory.AbstractFactory;
import com.pacific.creational.abstractfactory.model.Car;

public class CarDealer {

    AbstractFactory factory;

    public CarDealer(AbstractFactory factory){
        this.factory=factory;
    }

    /**
     * Using Factory Pattern
     * @return
     */
    public Car orderCar(){
        return factory.assemble();
    }
}
