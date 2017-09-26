package com.scossi.design.command;

/**
 * Created by gabriel on 16/09/17.
 */
//Invoker
public class RemoteControl{
    private Command command;
    public void setCommand(Command command){
        this.command = command;
    }
    public void pressButton(){
        command.execute();
    }
}
