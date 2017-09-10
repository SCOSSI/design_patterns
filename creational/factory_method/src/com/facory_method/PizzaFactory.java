package com.facory_method;

/**
 * Created by gabriel on 09/09/17.
 */
public abstract class PizzaFactory {
    protected Pizza pizza;

    public abstract void createPizza(FlavorEnum flavor);

    public Pizza delivery(){
        System.out.println("Default delivery");
        return pizza;
    }

}
