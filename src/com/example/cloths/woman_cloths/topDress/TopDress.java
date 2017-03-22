package com.example.cloths.woman_cloths.topDress;

import com.example.cloths.woman_cloths.WomanCloth;

/**
 * Created by СЕВАК on 20.03.2017.
 */
public class TopDress extends WomanCloth {

    private String sleevesStyle;
    private TShirt tShirt;

//    Constructor
    protected TopDress(String brand,
                 String color,
                 int size,
                 double price,
                 String name,
                 String sleevesStyle) {

        super(brand, color, size, price, "Top Dress", name);
        this.sleevesStyle = sleevesStyle;
    }

//    Decide Type
    protected void whatType(TShirt tShirt) {
        this.tShirt = tShirt;
    }

//    Draw
    protected void draw() {
        System.out.println("Top Dress:");
        super.draw();
        System.out.print(
                String.format("Sleeves Style: %s\n\n", sleevesStyle));
    }

//    Print
    public void print() {
        if(tShirt != null) {
            tShirt.draw();
            return;
        }
    }
}