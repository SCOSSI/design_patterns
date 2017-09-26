package com.scossi.design.command;

/**
 * Created by gabriel on 16/09/17.
 */
//Receiver
public class Light{
    private boolean on;

    public void switchOn(){
        on = true;
    }
    public void switchOff(){
        on = false;
    }
}
