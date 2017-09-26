package com.scossi.design.chain;

/**
 * Created by gabriel on 16/09/17.
 */
public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);

    void dispense(Currency currency);
}
