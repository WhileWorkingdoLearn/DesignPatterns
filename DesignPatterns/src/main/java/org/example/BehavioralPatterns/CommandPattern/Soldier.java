package org.example.BehavioralPatterns.CommandPattern;

public class Soldier implements Orders{

    private String rank;

    private String type;

    private String id;

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean move() {
        System.out.println("Solder moving to position");
        return false;
    }

    @Override
    public boolean hold() {
        System.out.println("Soldier waiting for orders");
        return false;
    }

    @Override
    public boolean attack() {
        System.out.println("Soldier attacking position");
        return false;
    }

    @Override
    public boolean defend() {
        System.out.println("Soldier defending to position");
        return false;
    }

    @Override
    public void cancel() {
        System.out.println("Soldier cancel order");
    }
}
