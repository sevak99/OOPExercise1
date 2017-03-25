package com.example.pets;

/**
 * Created by СЕВАК on 19.03.2017.
 */
public class Cat extends Pet {

    private String eyeColor;

//    Constructor
    public Cat(String name, int age, boolean gender, String eyeColor) {
        super(name, age, gender);
        this.eyeColor = eyeColor;
    }

//    Draw
    @Override
    protected void draw() {
        super.draw();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Eye Color: ").append(getEyeColor()).append('\n')
                .append('\n');
        System.out.print(stringBuilder);
    }

    public String getEyeColor() {
        return eyeColor;
    }
}
