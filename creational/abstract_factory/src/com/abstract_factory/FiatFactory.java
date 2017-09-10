package com.abstract_factory;

/**
 * Created by gabriel on 10/09/17.
 */
public class FiatFactory implements CarFactory {

    @Override
    public SedanCar createSedanCar() {
        return new Siena();
    }

    @Override
    public PopularCar createPopularCar() {
        return new Palio();
    }
}
