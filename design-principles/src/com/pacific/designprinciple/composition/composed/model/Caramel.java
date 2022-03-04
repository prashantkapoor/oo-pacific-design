package com.pacific.designprinciple.composition.composed.model;

public class Caramel implements Condiments {
    @Override
    public float cost() {
        return 7;
    }

    @Override
    public void prepare() {
        System.out.println("Adding Caramel");
    }
}
