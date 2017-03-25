package com.example.cloths.woman_cloths.hat;

import com.example.cloths.woman_cloths.WomanCloth;

/**
 * Created by СЕВАК on 20.03.2017.
 */
public class Hat extends WomanCloth {

    private String style;

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

//    Draw
    protected void draw() {
        System.out.println("Hat:");
        super.draw();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Style: ").append(getStyle()).append('\n');

        System.out.print(stringBuilder);
    }


    private String getStyle() {
        return style;
    }

//    Print
    public void print() {
        if(this instanceof Cap) {
            ((Cap) this).draw();
        }
    }
}
