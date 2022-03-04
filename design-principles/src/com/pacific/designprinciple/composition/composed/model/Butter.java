package com.pacific.designprinciple.composition.composed.model;

public class Butter implements Condiments {
    @Override
    public float cost() {
        return 5;
    }

    @Override
    public void prepare() {
        System.out.println("Adding Butter");
    }
}
