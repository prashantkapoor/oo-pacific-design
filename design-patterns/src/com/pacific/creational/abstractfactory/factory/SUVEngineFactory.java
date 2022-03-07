package com.pacific.creational.abstractfactory.factory;

import com.pacific.creational.abstractfactory.model.engine.DieselEngine;
import com.pacific.creational.abstractfactory.model.engine.Engine;

public class SUVEngineFactory extends EngineFactory{
    @Override
    Engine create() {
        return new DieselEngine();
    }
}
