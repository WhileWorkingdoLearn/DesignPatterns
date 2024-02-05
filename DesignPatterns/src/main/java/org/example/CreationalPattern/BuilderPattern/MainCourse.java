package org.example.CreationalPattern.BuilderPattern;

public class MainCourse {

    private String name;

    private boolean isVegetarian;

    private int calories;

    public MainCourse(String name, boolean vegetarien, int calories) {
        this.name = name;
        this.isVegetarian = vegetarien;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "MainCourse{" +
                "name='" + name + '\'' +
                ", isVegetarian=" + isVegetarian +
                ", calories=" + calories +
                '}';
    }
}
