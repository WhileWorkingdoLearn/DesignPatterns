package org.example.BehavioralPatterns.StrategyPattern;

public class Bunny extends AMamel {
    public void huepfe(){
        if(springVerhalten == null) return;
        springVerhalten.springe();
    }
    public void hoppel(){
        if(rennVerhalten == null) return;
        rennVerhalten.renne();
    }
}
