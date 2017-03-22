package com.example.Tattoo_and_MakeUp;

import com.example.cloths.man_cloths.ManCloth;

/**
 * Created by СЕВАК on 22.03.2017.
 */
public class Tattoo {
    private String color;

    public Tattoo(String color) {
        this.color = color;
    }

    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Color: ").append(getColor()).append('\n')
                .append('\n');
    }

    public String getColor() {
        return color;
    }
}
