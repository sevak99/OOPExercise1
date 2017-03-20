package com.example.cloths;

/**
 * Created by СЕВАК on 19.03.2017.
 */
public class Cloth {

    public String brand;
    public String color;
    public int size;
    public double price;
    public String category;
    public String type;
    public String name;

    public Cloth(String brand, String color, int size, double price, String category, String type, String name) {

        this.brand = brand;
        this.color = color;
        this.size = size;
        this.price = price;
        this.category = category;
        this.type = type;
        this.name = name;
    }

    public void draw(){

//        System.out.println (
//                "Brand: " + brand + "\n" +
//                "Co;or: " + color + "\n" +
//                "Size: " + size + "\n" +
//                "Price: " + price + "\n" +
//                "Category: " + category + "\n" +
//                "Type: " + type + "\n" +
//                "Name: " + name + "\n" );
        System.out.print(
                String.format("Brand: %s\n", brand) +
                String.format("Color: %s\n", color) +
                String.format("Size: %d\n", size) +
                String.format("Price: %.2f\n", price) +
                String.format("Category: %s\n", category) +
                String.format("Type: %s\n", type) +
                String.format("Name: %s\n", name)
        );
    }

}
