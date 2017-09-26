package com.scossi.design.visitor;

/**
 * Created by gabriel on 23/09/17.
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
