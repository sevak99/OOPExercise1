package com.example.cloths.woman_cloths.downDress;

import com.example.cloths.woman_cloths.WomanCloth;

/**
 * Created by СЕВАК on 20.03.2017.
 */
public class DownDress extends WomanCloth {

    private String material;

//    Constructor
    protected DownDress(String brand,
                        String color,
                        int size,
                        double price,
                        String name,
                        String material) {

        super(brand, color, size, price,"Down Dress", name);
        this.material = material;
    }

//    Draw
    protected void draw() {
        System.out.println("Down Dress:");
        super.draw();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Material: ").append(getMaterial()).append('\n');
        System.out.print(stringBuilder);
    }

    public String getMaterial() {
        return material;
    }

    //    Print
    public void print() {
        if(this instanceof Trousers) {
            ((Trousers) this).draw();
        }
    }
}
