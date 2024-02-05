package org.example.CreationalPattern.BuilderPattern;

public class Desert {
    private String name;

    private boolean isVegan;

    private int calories;

    public Desert(String name, boolean isVegan, int calories) {
        this.name = name;
        this.isVegan = isVegan;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "Desert{" +
                "name='" + name + '\'' +
                ", isVegan=" + isVegan +
                ", calories=" + calories +
                '}';
    }
}

