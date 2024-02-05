package org.example.BehavioralPatterns.StrategyPattern;

public class Dog extends AMamel{
    public void renne(){
        if(rennVerhalten == null) return;
        rennVerhalten.renne();
    }
    public void jump(){
        if(springVerhalten == null) return;
        springVerhalten.springe();
    }
}
