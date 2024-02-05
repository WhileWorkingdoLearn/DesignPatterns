package org.example.BehavioralPatterns.TemplateMethod;

public class Hochhaus extends Gebaeude{
    @Override
    public void leyFoundation() {
        System.out.println("Gieße Zement");
    }

    @Override
    public void pullUpWalls() {
        System.out.println("Errichte Träger und Betton");
    }

    @Override
    public void installWater() {
        System.out.println("Verlege Wasserleitungen und Pumpe");
    }

    @Override
    public void putInWindows() {
        System.out.println("Setzte Fenster ein");
    }

    @Override
    public void putInDoors() {
        System.out.println("Setzte Tueren ein");
    }

    @Override
    public void installElectric() {
        System.out.println("Installiere Elektronik und Sensoren");
    }

    @Override
    public void PaintWalls() {
        System.out.println("Verputze und Streiche Wände in Beige");
    }
}
