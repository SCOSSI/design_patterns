package com.prototype;

/**
 * Created by gabriel on 10/09/17.
 */
public interface Prototype extends Cloneable {
    AccessControl clone() throws CloneNotSupportedException;
}
