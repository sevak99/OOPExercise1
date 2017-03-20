package com.example.cloths.man_cloths;

import com.example.cloths.Cloth;
import com.example.cloths.man_cloths.shoes.Shoes;

/**
 * Created by СЕВАК on 19.03.2017.
 */
public class ManCloth extends Cloth{

    public ManCloth(String brand, String color, int size, double price, String category, String type, String name) {

        super(brand, color, size, price, category, type, name);
    }

    public void draw() {

        super.draw();
    }

//    public void isManCloth(String category) {
//        if(category.toLowerCase().equals("man cloth") == false) {
//            System.out.println("This is no man cloth. Please dress man cloth");
//        }
//    }

}
