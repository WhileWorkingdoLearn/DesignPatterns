package org.example.StructuralPattern.Bridge.Juice;

import org.example.StructuralPattern.Bridge.Fruits.Fruit;

public class JuiceImpl extends Juice{

    private Fruit fruit;

    public JuiceImpl(Fruit taste) {
        super(taste);
        this.fruit = taste;
    }

    @Override
    public void getFlavor() {
            fruit.type();
    }
}
