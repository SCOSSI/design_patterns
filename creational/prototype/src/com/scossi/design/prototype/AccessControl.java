package com.scossi.design.prototype;

/**
 * Created by gabriel on 10/09/17.
 */
public class AccessControl implements Prototype{
    private final String controlLevel;
    private String access;

    public AccessControl(String controlLevel,String access){
        this.controlLevel = controlLevel;
        this.access = access;
    }

    @Override
    public AccessControl clone(){
        try {
            System.out.println("Using clone");
            return (AccessControl) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getControlLevel(){
        return controlLevel;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }
}
