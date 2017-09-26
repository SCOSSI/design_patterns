package com.scossi.design.observer;

/**
 * Created by gabriel on 23/09/17.
 */
public class HexObserver extends Observer{
    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.print(" " + Integer.toHexString(subject.getState()));
    }
}
