package org.example.BehavioralPatterns.StrategyPattern.RennVerhalten;

public class ImKreisRennen implements RennVerhalten{
    @Override
    public void renne() {
        System.out.println("Ich laufe im Kreis");
    }
}
