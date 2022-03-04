package com.pacific.designprinciple.composition.composed.model;

import com.pacific.designprinciple.composition.composed.model.Condiments;

import java.util.List;

public class Coffee {
    List<Condiments> condiments;
    float cost;

    public float cost() {
        for(Condiments condiment:condiments){
            this.cost+=condiment.cost();
        }
        return this.cost;
    }

    public void addCondiments(Condiments condiments) {
        this.condiments.add(condiments);
        prepare();
    }

    public void prepare() {
        System.out.println("Preparing Coffee, please wait.. ");
        for(Condiments condiment:condiments){
            condiment.prepare();
        }
    }
}
