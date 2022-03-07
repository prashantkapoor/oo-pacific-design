package com.pacific.creational.abstractfactory.factory;

import com.pacific.creational.abstractfactory.model.body.CarBody;
import com.pacific.creational.abstractfactory.model.body.SUVBody;
import com.pacific.creational.abstractfactory.model.engine.DieselEngine;
import com.pacific.creational.abstractfactory.model.engine.Engine;

public class SUVFactory implements AbstractFactory{
    @Override
    public CarBody createBody() {
        System.out.println("Creating SUV chasis");
        return new SUVBody();
    }

    @Override
    public Engine createEngine() {
        System.out.println("Creating Diesel Engine for SUV");
        return new DieselEngine();
    }
}
