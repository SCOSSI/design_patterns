package com.scossi.design.chain;

/**
 * Created by gabriel on 16/09/17.
 */
public class Dollar50Dispenser implements DispenseChain {
    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        dispenseChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 50){
            int num = currency.getAmount()/50;
            int remainder = currency.getAmount() % 50;
            System.out.println("Dispensing "+num+" 50$ note");
            if(remainder !=0) dispenseChain.dispense(new Currency(remainder));
        }else{
            dispenseChain.dispense(currency);
        }
    }
}
