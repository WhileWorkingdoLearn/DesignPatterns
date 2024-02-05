package org.example.BehavioralPatterns.StrategyPattern.RennVerhalten;

public class ZickZackRennen implements RennVerhalten{
    @Override
    public void renne() {
        System.out.println("Ich laufe im Zickzack");
    }
}
