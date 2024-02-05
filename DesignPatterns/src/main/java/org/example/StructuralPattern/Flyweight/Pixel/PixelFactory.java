package org.example.StructuralPattern.Flyweight.Pixel;

import java.util.HashMap;

public class PixelFactory {

    private int pixelCreatedCount = 0;

    private static class Helper{
        private static final PixelFactory Instance = new PixelFactory();
    }

    public static PixelFactory getInstance(){
        return  Helper.Instance;
    }

    private final HashMap<String,Pixel> colorPixelHashMap;
    private PixelFactory(){
        colorPixelHashMap = new HashMap<>();
    }

    public Pixel getPixel(String color){
       Pixel pixel =  colorPixelHashMap.get(color);
       if(pixel == null){
           pixel = new PixelImpl(color);
           colorPixelHashMap.put(color,pixel);
           System.out.println("Creating Pixel of color: " + color);

       } else {
           pixelCreatedCount++;

       }

        return pixel;
    }

    public int reusedPixel(){return pixelCreatedCount;}

    public int countKeys(){
       return colorPixelHashMap.size();
    }


}
