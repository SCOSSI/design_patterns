package com.abstract_factory;

/**
 * Created by gabriel on 10/09/17.
 */
public class Main {
    public static void main(String[] args) {
        CarFactory factory = new FiatFactory();
        SedanCar sedan = factory.createSedanCar();
        PopularCar popular = factory.createPopularCar();
        sedan.info();
        popular.info();

        factory = new FordFactory();
        sedan = factory.createSedanCar();
        popular = factory.createPopularCar();
        sedan.info();
        popular.info();
    }
}
