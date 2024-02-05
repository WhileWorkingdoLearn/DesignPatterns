package org.example.CreationalPattern.Singelton;


/*
* Bill Pugh Solution
* */

public class Unikat {

    private static class Helper {
        private static final Unikat Instance = new Unikat();
    }

    private Unikat(){

    }

    public static Unikat getInstance(){
        return  Helper.Instance;
    }

    public void accessMessage(){
        System.out.println("Ein echtes Unikat: " + this.getClass().getSimpleName());
    }
}
