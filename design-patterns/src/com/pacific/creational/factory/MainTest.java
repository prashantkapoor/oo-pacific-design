package com.pacific.creational.factory;

import com.pacific.creational.factory.factorymethod.HatchBackFactory;
import com.pacific.creational.factory.factorymethod.SedanFactory;

public class MainTest {

    public static void main(String[] args){
        CarDealer hatchBackDealer=new CarDealer(new HatchBackFactory());
        hatchBackDealer.orderCar();


        CarDealer sedanDealer=new CarDealer(new SedanFactory());
        sedanDealer.orderCar();

    }
}
