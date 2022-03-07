package com.pacific.creational.abstractfactory;

import com.pacific.creational.abstractfactory.factory.AbstractFactory;
import com.pacific.creational.abstractfactory.factory.SUVFactory;
import com.pacific.creational.factory.factorymethod.HatchBackFactory;
import com.pacific.creational.factory.factorymethod.SedanFactory;

public class MainTest {

    public static void main(String[] args){

        CarDealer dealer=new CarDealer(new SUVFactory());
        dealer.orderCar();
    }
}
