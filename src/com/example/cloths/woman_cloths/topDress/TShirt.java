package com.example.cloths.woman_cloths.topDress;

/**
 * Created by СЕВАК on 21.03.2017.
 */
public class TShirt extends TopDress {

//    Constructor
    public TShirt(String brand, String color, int size, double price, String sleevesStyle) {
        super(brand, color, size, price, "T-Shirt", sleevesStyle);

        whatType(this);
    }

//    Draw
    @Override
    protected void draw() {
        super.draw();
    }
}
