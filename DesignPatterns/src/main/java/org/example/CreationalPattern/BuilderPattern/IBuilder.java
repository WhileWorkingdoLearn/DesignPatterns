package org.example.CreationalPattern.BuilderPattern;

public interface IBuilder {
    Meal build();

    Meal build(String name,Entry entry,MainCourse mainCourse,Desert desert);
}
