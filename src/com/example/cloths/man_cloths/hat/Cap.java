package com.example.cloths.man_cloths.hat;

/**
 * Created by СЕВАК on 21.03.2017.
 */
public class Cap extends Hat {

//    Constructor
    public Cap(String brand, String color, int size, double price, String style) {

        super(brand, color, size, price, "Cap", style);

        whatType(this);
    }

//    Draw
    @Override
    protected void draw() {
        super.draw();
    }
}
