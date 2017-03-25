package com.example.cloths.woman_cloths.hat;

/**
 * Created by СЕВАК on 21.03.2017.
 */
public class Cap extends Hat {

//    Constructor
    public Cap(String brand, String color, int size, double price, String style) {

        super(brand, color, size, price, "Cap", style);
    }

//    Draw
    @Override
    protected void draw() {
        super.draw();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('\n');

        System.out.print(stringBuilder);
    }
}
