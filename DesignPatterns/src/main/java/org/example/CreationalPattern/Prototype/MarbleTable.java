package org.example.CreationalPattern.Prototype;

public class MarbleTable extends  Table {

    private final float height;
    private final float width;
    private final String material;

    public MarbleTable(float height, float width, String material) {
        super(height, width, material);
        this.height = height;
        this.width = width;
        this.material = material;
    }

    private MarbleTable(MarbleTable table){
        this(table.height,table.width,table.material);
    }

    @Override
    public Table copy() {
        return new MarbleTable(this);
    }
}
