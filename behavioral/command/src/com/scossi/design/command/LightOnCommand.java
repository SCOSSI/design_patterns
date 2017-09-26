package com.scossi.design.command;

/**
 * Created by gabriel on 16/09/17.
 */
//Concrete Command
public class LightOnCommand implements Command{
    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute(){
        System.out.println("Execute light on.");
        light.switchOn();
    }
}
