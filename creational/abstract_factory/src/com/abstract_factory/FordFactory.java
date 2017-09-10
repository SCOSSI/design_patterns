package com.abstract_factory;

/**
 * Created by gabriel on 10/09/17.
 */
public class FordFactory implements CarFactory{


    @Override
    public SedanCar createSedanCar() {
        return new KaSedan();
    }

    @Override
    public PopularCar createPopularCar() {
        return new KaPopular();
    }
}
