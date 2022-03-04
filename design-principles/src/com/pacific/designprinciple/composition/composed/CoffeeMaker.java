package com.pacific.designprinciple.composition.composed;

import com.pacific.designprinciple.composition.composed.model.Coffee;
import com.pacific.designprinciple.composition.composed.model.Condiments;

import java.util.List;

public class CoffeeMaker {
    Coffee coffee;

    public void makeCoffee(){
        coffee=new Coffee();
        //coffee.addCondiments(condiments);
    }

    public void addCondiment(Condiments condiment){
        coffee=new Coffee();
        coffee.addCondiments(condiment);
    }

    public float getCost(){
        return coffee.cost();
    }
}
