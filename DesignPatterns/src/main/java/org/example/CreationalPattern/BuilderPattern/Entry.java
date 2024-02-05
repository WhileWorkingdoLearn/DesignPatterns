package org.example.CreationalPattern.BuilderPattern;

public class Entry {
    public final String name;
    public final boolean isSoup;

    private int calories;

    public Entry(String name, boolean isSoup) {
        this.name = name;
        this.isSoup = isSoup;
    }

    public String getName() {
        return name;
    }


    public boolean isSoup() {
        return isSoup;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "name='" + name + '\'' +
                ", isSoup=" + isSoup +
                ", calories=" + calories +
                '}';
    }
}
