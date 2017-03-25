package com.example.Tattoo_and_MakeUp;

/**
 * Created by СЕВАК on 22.03.2017.
 */
public class MakeUp {

    private String colorLipstick;

//    Constructor
    public MakeUp(String colorLipstick) {
        this.colorLipstick = colorLipstick;
    }

//    Draw
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Make up:").append('\n')
                .append("Color Lipstick: ").append(getColorLipstick()).append('\n')
                .append('\n');
        System.out.print(stringBuilder);
    }

    public String getColorLipstick() {
        return colorLipstick;
    }
}
