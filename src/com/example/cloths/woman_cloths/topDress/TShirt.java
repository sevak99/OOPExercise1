package com.example.cloths.woman_cloths.topDress;

/**
 * Created by СЕВАК on 21.03.2017.
 */
public class TShirt extends TopDress {

    private String sleevesStyle;

//    Constructor
    public TShirt(String brand, String color, int size, double price, String sleevesStyle) {
        super(brand, color, size, price, "T-Shirt", sleevesStyle);

        this.sleevesStyle = sleevesStyle;
    }

//    Draw
    @Override
    protected void draw() {

        super.draw();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sleeves Style: ").append(getSleevesStyle()).append('\n')
                .append('\n');
        System.out.print(stringBuilder);
    }

    public String getSleevesStyle() {
        return sleevesStyle;
    }
}
