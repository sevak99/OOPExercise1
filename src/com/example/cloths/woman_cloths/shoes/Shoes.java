package com.example.cloths.woman_cloths.shoes;

import com.example.cloths.woman_cloths.WomanCloth;

/**
 * Created by СЕВАК on 20.03.2017.
 */
public class Shoes extends WomanCloth{

    private String season;
    private String style;
    private Sneakers sneakers;

//    Constructor
    protected Shoes(String brand,
                 String color,
                 int size,
                 double price,
                 String name,
                 String season,
                 String style) {

        super(brand, color, size, price, "Shoes", name);
        this.season = season;
        this.style = style;
    }

//    Decide Type
    protected void whatType(Sneakers sneakers) {
        this.sneakers = sneakers;
    }

//    Draw
    protected void draw() {
        System.out.println("Shoes:");
        super.draw();
        System.out.print(
                String.format("Season: %s\n", season) +
                String.format("Style: %s\n\n", style));
    }

//    Print
    public void print() {
        if(sneakers != null) {
            sneakers.draw();
        }
    }
}
