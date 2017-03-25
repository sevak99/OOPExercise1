package com.example.cloths.man_cloths.shoes;

import com.example.cloths.man_cloths.ManCloth;

/**
 * Created by СЕВАК on 20.03.2017.
 */
public class Shoes extends ManCloth{

    private String season;
    private String style;

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

//    Draw
    protected void draw() {
        System.out.println("Shoes:");
        super.draw();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Season: ").append(getSeason()).append('\n')
                .append("Style: ").append(getStyle()).append('\n')
                .append('\n');

        System.out.print(stringBuilder);
    }

    private String getSeason() {
        return season;
    }

    private String getStyle() {
        return style;
    }

    //    Print
    public void print() {
        if(this instanceof Sneakers) {
            ((Sneakers) this).draw();
        }
    }
}
