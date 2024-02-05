package org.example.StructuralPattern.Composite;

import java.util.ArrayList;

public class Department implements Composite {

    private final String desc;
    private final ArrayList<Component> list = new ArrayList<>();

    public Department(String desc) {
        this.desc = desc;
    }

    @Override
    public String getDescription() {
        return desc;
    }

    @Override
    public void operation() {
        System.out.println("Ich bin das" + this.desc + " Department. Meine Angestellten sind sind:");
        for (Component item: list) {
            item.operation();
        }
    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(int index) {
            list.remove(index);
    }

    @Override
    public Component getChild(int index) {
        return list.get(index);
    }
}
