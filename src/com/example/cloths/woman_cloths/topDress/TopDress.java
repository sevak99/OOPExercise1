package com.example.cloths.woman_cloths.topDress;

import com.example.cloths.woman_cloths.WomanCloth;

/**
 * Created by СЕВАК on 20.03.2017.
 */
public class TopDress extends WomanCloth {

//    Constructor
    protected TopDress(String brand,
                 String color,
                 int size,
                 double price,
                 String name,
                 String sleevesStyle) {

        super(brand, color, size, price, "Top Dress", name);

    }

//    Draw
    protected void draw() {
        System.out.println("Top Dress:");
        super.draw();
    }

//    Print
    public void print() {
        if(this instanceof TShirt) {
            ((TShirt) this).draw();
        }
    }
}