package com.facory_method;

/**
 * Created by gabriel on 09/09/17.
 */
public class PizzaFactoryCanoas extends PizzaFactory {

    Pizza pizza;

    @Override
    public void createPizza(FlavorEnum flavor) {
        switch (flavor) {
            case MARGHERITA:
                pizza = new MargheritaPizzaCanoas();
            case PEPPERONI:
                pizza = new PepperoniPizzaCanoas();
            case CHEESE:
                pizza = new CheesePizzaCanoas();
        }
    }

    public Pizza delivery(){
        System.out.println("Canoas delivery");
        return pizza;
    }
}
