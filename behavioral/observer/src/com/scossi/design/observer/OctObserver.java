package com.scossi.design.observer;

/**
 * Created by gabriel on 23/09/17.
 */
public class OctObserver extends Observer {
    public OctObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.print(" " + Integer.toOctalString(subject.getState()));
    }
}
