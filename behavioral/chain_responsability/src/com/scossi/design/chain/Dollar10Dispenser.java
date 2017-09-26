package com.scossi.design.chain;

/**
 * Created by gabriel on 16/09/17.
 */
public class Dollar10Dispenser implements DispenseChain {
    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        dispenseChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 10){
            int num = currency.getAmount()/10;
            int remainder = currency.getAmount() % 10;
            System.out.println("Dispensing "+num+" 10$ note");
            if(remainder !=0) dispenseChain.dispense(new Currency(remainder));
        }else{
            dispenseChain.dispense(currency);
        }
    }
}
