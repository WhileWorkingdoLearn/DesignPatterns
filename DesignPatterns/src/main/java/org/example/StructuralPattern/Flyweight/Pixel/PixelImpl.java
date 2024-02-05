package org.example.StructuralPattern.Flyweight.Pixel;

public class PixelImpl implements Pixel{
    private int state = 0;

    private final String color;

    public PixelImpl(String color) {
        this.color = color;
    }

    @Override
    public void on() {
            state = 1;
    }

    @Override
    public void off() {
            state = 0;
    }

    public boolean state(){
        return state == 1;
    }

    @Override
    public String getColor() {
        return color;
    }
}
