package com.example.cloths.woman_cloths.hat;

import com.example.cloths.woman_cloths.WomanCloth;

/**
 * Created by СЕВАК on 20.03.2017.
 */
public class Hat extends WomanCloth {

    private String style;
    private Cap cap;
//    Constructor
    protected Hat(String brand,
                 String color,
                 int size,
                 double price,
                 String name,
                 String style) {

        super(brand, color, size, price,"Hat", name);
        this.style = style;
    }

//    Decide Type
    protected void whatType(Cap cap) {
        this.cap = cap;
    }

//    Draw
    protected void draw() {
        System.out.println("Hat:");
        super.draw();
        System.out.print(
                String.format("Style: %s\n\n", style));
    }

//    Print
    public void print() {
        if(hasCap()) {
            cap.draw();
            return;
        }
    }

    private boolean hasCap() {
        if(cap == null) return false;
        return true;
    }
}
