package com.scossi.design.singleton;

/**
 * Created by gabriel on 10/09/17.
 */
public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){}

    public synchronized static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
            System.out.println("new LazyInitializedSingleton.");
        }
        System.out.println("returning used instance!");
        return instance;
    }
}
