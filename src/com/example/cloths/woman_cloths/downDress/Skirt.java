package com.example.cloths.woman_cloths.downDress;

/**
 * Created by СЕВАК on 25.03.2017.
 */
public class Skirt extends DownDress {

    private String typeOfLength;

    public Skirt(String brand, String color, int size, double price, String material, String typeOfLength ) {
        super(brand, color, size, price, "Skirt", material);
        this.typeOfLength = typeOfLength;
    }

    @Override
    protected void draw() {
        super.draw();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Type of Length: ").append(getName()).append('\n')
                .append('\n');
        System.out.print(stringBuilder);
    }

    public String getTypeOfLength() {
        return typeOfLength;
    }
}
