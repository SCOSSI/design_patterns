package com.scossi.design.facorymethod;

/**
 * Created by gabriel on 09/09/17.
 */
public class Pizza {
    protected FlavorEnum flavor;

    public FlavorEnum getFlavor() {
        return flavor;
    }

    public void setFlavor(FlavorEnum flavor) {
        this.flavor = flavor;
    }
}
