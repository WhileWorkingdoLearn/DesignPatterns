package org.example.BehavioralPatterns.TemplateMethod;

public abstract class Gebaeude {


    public void leyFoundation() {
        System.out.println("Lege Grundierung");
    }


    public void pullUpWalls() {
        System.out.println("Errichte Holzträger und Holzwände");
    }

    public void installWater() {
        System.out.println("Verlege Wasserleitungen");
    }


    public void putInWindows() {
        System.out.println("Setzte Fenster ein");
    }


    public void putInDoors() {
        System.out.println("Setzte Einfache Tueren ein");
    }


    public void installElectric() {
        System.out.println("Installiere Elektronik");
    }


    public void PaintWalls() {
        System.out.println("Verputze und Streiche Wände in Beige");
    }

    public final void  buildFacility(){
        leyFoundation();
        pullUpWalls();
        installWater();
        putInWindows();
        putInDoors();
        installElectric();
        PaintWalls();
    }
}
