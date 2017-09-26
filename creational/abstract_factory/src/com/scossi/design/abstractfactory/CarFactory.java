package com.scossi.design.abstractfactory;

/**
 * Created by gabriel on 10/09/17.
 */
public interface CarFactory{
    SedanCar createSedanCar();
    PopularCar createPopularCar();
}
