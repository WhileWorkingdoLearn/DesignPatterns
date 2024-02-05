package org.example.CreationalPattern.Prototype;

public abstract class Table {
    private final float height;
    private final float width;
    private final String material;

    public Table(float height, float width, String material) {
        this.height = height;
        this.width = width;
        this.material = material;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public String getMaterial() {
        return material;
    }

    public abstract Table copy();

    @Override
    public String toString() {
        return "Table{" +
                "height=" + height +
                ", width=" + width +
                ", material='" + material + '\'' +
                '}';
    }
}
