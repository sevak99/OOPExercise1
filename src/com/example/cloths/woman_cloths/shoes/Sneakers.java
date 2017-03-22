package com.example.cloths.woman_cloths.shoes;

/**
 * Created by СЕВАК on 21.03.2017.
 */
public class Sneakers extends Shoes {

//    Constructor
    public Sneakers(String brand, String color, int size, double price, String season, String style) {

        super(brand, color, size, price, "Sneakers", season, style);

        whatType(this);
    }

//    Draw
    @Override
    protected void draw() {
        super.draw();
    }
}
