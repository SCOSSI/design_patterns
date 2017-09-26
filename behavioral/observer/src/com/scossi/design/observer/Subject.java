package com.scossi.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gabriel on 23/09/17.
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public void add(Observer o) {
        observers.add(o);
    }

    public int getState() {
        return state;
    }

    public void setState(int value) {
        this.state = value;
        execute();
    }

    private void execute() {
        observers.forEach(Observer::update);
    }
}
