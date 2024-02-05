package org.example.StructuralPattern.Decorator_Wrapper;

public class BlueDress extends ADollDecorator{
    public BlueDress(DollDress doll) {
        super(doll);
    }

    @Override
    public String dress() {
        return doll.dress() + " in a Blue Dress";
    }
}
