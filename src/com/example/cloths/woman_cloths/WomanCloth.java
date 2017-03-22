package com.example.cloths.woman_cloths;

import com.example.cloths.Cloth;

/**
 * Created by СЕВАК on 19.03.2017.
 */
public class WomanCloth extends Cloth {

//    Constructor
    public WomanCloth(String brand, String color, int size, double price, String type, String name) {

        super(brand, color, size, price, "Woman Cloth", type, name);
    }

//    Draw
    @Override
    protected void draw() {

        super.draw();
    }
}
