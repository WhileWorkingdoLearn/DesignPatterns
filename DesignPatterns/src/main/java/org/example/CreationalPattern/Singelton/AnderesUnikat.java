package org.example.CreationalPattern.Singelton;

public class AnderesUnikat {

    private static volatile AnderesUnikat instance = null;


    private AnderesUnikat(){}

    public static  AnderesUnikat getInstance(){
        if(instance == null){
            synchronized (AnderesUnikat.class){
                if(instance == null){
                    instance = new AnderesUnikat();
                }
            }
        }
        return instance;
    }

    public void accessMessage(){
        System.out.println("Ein echtes Unikat: " + this.getClass().getSimpleName());
    }
}
