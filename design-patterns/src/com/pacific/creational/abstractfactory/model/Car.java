package com.pacific.creational.abstractfactory.model;

import com.pacific.creational.abstractfactory.model.body.CarBody;
import com.pacific.creational.abstractfactory.model.engine.Engine;

public class Car {
    CarBody body;
    Engine engine;

    public Car(CarBody body, Engine engine) {
        this.body=body;
        this.engine=engine;
    }
}
