package com.pacific.creational.abstractfactory.factory;

import com.pacific.creational.abstractfactory.model.body.CarBody;
import com.pacific.creational.abstractfactory.model.body.SUVBody;

public class SUVBodyFactory extends BodyFactory{
    @Override
    CarBody create() {
        return new SUVBody();
    }
}
