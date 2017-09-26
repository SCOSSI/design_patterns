package com.scossi.design.facorymethod;

/**
 * Created by gabriel on 09/09/17.
 */
public class MainPizzeria {
    public static void main( String[] args ){
        /* PORTO ALEGRE */
        PizzaFactory pizzeriaPortoAlegre = new PizzaFactoryPortoAlergre();
        pizzeriaPortoAlegre.createPizza(FlavorEnum.CHEESE);
        Pizza pizza = pizzeriaPortoAlegre.delivery();

        /* CANOAS */
        PizzaFactory pizzeriaCanoas = new PizzaFactoryCanoas();
        pizzeriaCanoas.createPizza(FlavorEnum.PEPPERONI);
        pizza = pizzeriaCanoas.delivery();
    }
}
