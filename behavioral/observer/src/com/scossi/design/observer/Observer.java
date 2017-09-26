package com.scossi.design.observer;

/**
 * Created by gabriel on 23/09/17.
 */
abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
