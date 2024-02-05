package org.example.StructuralPattern.Bridge.Juice;

import org.example.StructuralPattern.Bridge.Fruits.Fruit;

public abstract class Juice {

    private final Fruit fruit;

    public Juice(Fruit taste){
        this.fruit = taste;
    }

    public  abstract void getFlavor();
}
