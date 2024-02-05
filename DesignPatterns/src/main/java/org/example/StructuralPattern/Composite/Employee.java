package org.example.StructuralPattern.Composite;

public class Employee implements Leaf {

    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return "Employee";
    }

    @Override
    public void operation() {
        System.out.println("Ich bin ein Angestellter! Mein Name ist: " + this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
