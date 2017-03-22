package com.example.cloths.woman_cloths.downDress;

import com.example.cloths.woman_cloths.WomanCloth;

/**
 * Created by СЕВАК on 20.03.2017.
 */
public class DownDress extends WomanCloth {

    private Trousers trousers;

//    Constructor
    protected DownDress(String brand,
                        String color,
                        int size,
                        double price,
                        String name) {


        super(brand, color, size, price,"Down Dress", name);
    }

//    Decide Type
    protected void whatType(Trousers trousers) {
        this.trousers = trousers;
    }

//    Draw
    protected void draw() {
        System.out.println("Down Dress:");
        super.draw();
    }

//    Print
    public void print() {
        if(hasTrousers()) {
            trousers.draw();
            return;
        }
    }

    private boolean hasTrousers() {
        if(trousers == null) return false;
        return true;
    }
}
