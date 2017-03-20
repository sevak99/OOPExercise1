package com.example.cloths.man_cloths.shoes;

import com.example.cloths.Cloth;
import com.example.cloths.man_cloths.ManCloth;

/**
 * Created by СЕВАК on 20.03.2017.
 */
public class Shoes extends ManCloth{

    public String season;
    public String style;

    public Shoes(String brand,
                 String color,
                 int size,
                 double price,
                 String category,
                 String type,
                 String name,
                 String season,
                 String style) {

        super(brand, color, size, price, category, type, name);
        this.season = season;
        this.style = style;
    }

    public void draw() {
        System.out.println("Shoes:");
        super.draw();
        System.out.print(
                String.format("Season: %s\n", season) +
                String.format("Style: %s\n", style));
    }
}
