package com.facory_method;

/**
 * Created by gabriel on 09/09/17.
 */
public class PizzaFactoryPortoAlergre extends PizzaFactory {
    @Override
    public void createPizza(FlavorEnum flavor) {
        switch (flavor) {
            case MARGHERITA:
                pizza = new MargheritaPizzaPortoAlegre();
            case PEPPERONI:
                pizza = new PepperoniPizzaPortoAlegre();
            case CHEESE:
                pizza = new CheesePizzaCanoas();
        }
    }
}
