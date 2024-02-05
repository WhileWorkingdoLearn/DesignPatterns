package org.example.StructuralPattern.Decorator_Wrapper;

public abstract class ADollDecorator implements DollDress {
    protected  final DollDress doll;

    public ADollDecorator(DollDress doll) {
        this.doll = doll;
    }

}
