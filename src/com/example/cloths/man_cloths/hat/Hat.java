package com.example.cloths.man_cloths.hat;

import com.example.cloths.man_cloths.ManCloth;

/**
 * Created by СЕВАК on 20.03.2017.
 */
public class Hat extends ManCloth {

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

    public String getStyle() {
        return style;
    }

    //    Print
    public void print() {
        if(this instanceof Cap) {
            ((Cap) this).draw();
        }
    }
}
