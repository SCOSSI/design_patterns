package com.scossi.design.command;

/**
 * Created by gabriel on 16/09/17.
 */
public class LightOffCommand implements Command{
    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("Execute light off.");
        light.switchOff();
    }
}
