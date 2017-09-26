package com.scossi.design.chain;

/**
 * Created by gabriel on 16/09/17.
 */
public class Dollar20Dispenser implements DispenseChain {
    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        dispenseChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 20){
            int num = currency.getAmount()/20;
            int remainder = currency.getAmount() % 20;
            System.out.println("Dispensing "+num+" 20$ note");
            if(remainder !=0) dispenseChain.dispense(new Currency(remainder));
        }else{
            dispenseChain.dispense(currency);
        }
    }
}
