package com.scossi.design.visitor;

/**
 * Created by gabriel on 23/09/17.
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}
