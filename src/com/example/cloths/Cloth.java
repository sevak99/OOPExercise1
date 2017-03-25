package com.example.cloths;

/**
 * Created by СЕВАК on 19.03.2017.
 */
public class Cloth {

    private String brand;
    private String color;
    private int size;
    private double price;
    private String category;
    private String type;
    private String name;

//    Constructor
    protected Cloth(String brand, String color, int size, double price, String category, String type, String name) {

        this.brand = brand;
        this.color = color;
        this.size = size;
        this.price = price;
        this.category = category;
        this.type = type;
        this.name = name;
    }

//    Draw
    protected void draw(){

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Brand: ").append(getBrand()).append('\n')
                .append("Color: ").append(getColor()).append('\n')
                .append("Size: ").append(getSize()).append('\n')
                .append("Price: ").append(getPriceInString()).append('\n')
                .append("Category: ").append(getCategory()).append('\n')
                .append("Type: ").append(getType()).append('\n')
                .append("Name: ").append(getName()).append('\n');

        System.out.print(stringBuilder);

    }

    private String getBrand() {
        return brand;
    }
    private String getColor() {
        return color;
    }
    private String getSize() {
        if(size < 0) {
            return "Size can not be negative";
        }
        return new Integer(size).toString();
    }
    private String getPriceInString() {

        if(getPrice() == -1)
            System.out.print("Price can not be negative");
        return String.format("%.2f", price);
    }
    private String getCategory() {
        return category;
    }
    private String getType() {
        return type;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        if(price < 0)
            return -1;
        return price;
    }
}
