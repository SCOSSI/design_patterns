package com.scossi.design.visitor;

/**
 * Created by gabriel on 23/09/17.
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
