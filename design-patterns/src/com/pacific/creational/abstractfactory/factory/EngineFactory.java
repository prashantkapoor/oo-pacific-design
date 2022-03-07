package com.pacific.creational.abstractfactory.factory;

import com.pacific.creational.abstractfactory.model.body.CarBody;
import com.pacific.creational.abstractfactory.model.engine.Engine;

public abstract class EngineFactory {

    abstract Engine create();

    public Engine manufacture(){
        Engine engine=create();
        engine.engineInfo();
        return engine;
    }
}
