package org.example.CreationalPattern.BuilderPattern;

public class Meal {

    private final String name;

    private final Entry entry;

    private final MainCourse mainCourse;

    private final Desert desert;

    private Meal(Builder builder){
        this.name = builder.getName();
        this.entry = builder.getEntry();
        this.mainCourse = builder.getMainCourse();
        this.desert = builder.getDesert();
    }

    public String getName() {
        return name;
    }

    public Entry getEntry() {
        return entry;
    }

    public MainCourse getMainCourse() {
        return mainCourse;
    }

    public Desert getDesert() {
        return desert;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "name='" + name + '\'' +
                ", entry=" + entry +
                ", mainCourse=" + mainCourse +
                ", desert=" + desert +
                '}';
    }

    public static class Builder implements IBuilder{

        private String name;

        private Entry entry;

        private MainCourse mainCourse;

        private Desert desert;

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public String getName() {
            return name;
        }

        public Entry getEntry() {
            return entry;
        }

        public MainCourse getMainCourse() {
            return mainCourse;
        }

        public Desert getDesert() {
            return desert;
        }

        public Builder setEntry(Entry entry){
            this.entry = entry;
            return this;
        }

        public Builder setMainCourse(MainCourse mainCourse){
            this.mainCourse = mainCourse;
            return this;
        }

        public  Builder setDesert(Desert desert){
            this.desert = desert;
            return this;
        }

        public Meal build(){
            return new Meal(this);
        }

        @Override
        public Meal build(String name, Entry entry, MainCourse mainCourse, Desert desert) {
            this.name = name;
            this.entry = entry;
            this.mainCourse = mainCourse;
            this.desert = desert;
            return new Meal(this);
        }
    }
}
