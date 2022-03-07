package com.pacific.creational.abstractfactory.factory;

import com.pacific.creational.abstractfactory.model.body.CarBody;
import com.pacific.creational.abstractfactory.model.body.SedanBody;
import com.pacific.creational.abstractfactory.model.engine.Engine;
import com.pacific.creational.abstractfactory.model.engine.PetrolEngine;
import com.pacific.creational.factory.factorymethod.CarFactory;
import com.pacific.creational.factory.model.Car;
import com.pacific.creational.factory.model.Sedan;

public class SedanFactory implements AbstractFactory {

    @Override
    public CarBody createBody() {
        return new SedanBody();
    }

    @Override
    public Engine createEngine() {
        return new PetrolEngine();
    }
}
