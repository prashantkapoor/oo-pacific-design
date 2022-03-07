package com.pacific.creational.abstractfactory.factory;

import com.pacific.creational.abstractfactory.model.body.CarBody;

public abstract class BodyFactory {
    abstract CarBody create();

    public CarBody manufacture(){
        CarBody body=create();
        body.ensureQualityCheck();
        return body;
    }
}
