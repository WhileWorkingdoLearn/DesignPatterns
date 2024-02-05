package org.example.StructuralPattern.Decorator_Wrapper;

public class RedDress extends ADollDecorator{

    public RedDress(DollDress doll) {
        super(doll);
    }

    @Override
    public String dress() {
        return doll.dress() + " in a Red Dress";
    }
}
