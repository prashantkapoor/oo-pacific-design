package com.pacific.creational.abstractfactory.factory;

import com.pacific.creational.abstractfactory.model.Car;
import com.pacific.creational.abstractfactory.model.body.CarBody;
import com.pacific.creational.abstractfactory.model.engine.Engine;

public interface AbstractFactory {
    CarBody createBody();
    Engine createEngine();

    default Car assemble(){
        CarBody body=createBody();
        Engine engine=createEngine();
        Car car=new Car(body,engine);
        return car;
    }
}
