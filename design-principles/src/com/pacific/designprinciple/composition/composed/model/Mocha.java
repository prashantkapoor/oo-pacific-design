package com.pacific.designprinciple.composition.composed.model;

public class Mocha implements Condiments{
    @Override
    public float cost() {
        return 4;
    }

    @Override
    public void prepare() {
        System.out.println("Adding Mocha");
    }
}
