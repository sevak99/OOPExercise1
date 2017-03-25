package com.example.pets;

/**
 * Created by СЕВАК on 19.03.2017.
 */
public class Dog extends Pet {

    private boolean isFighting;
    private boolean areEarsCut;

//    Constructor
    public Dog(String name, int age, boolean gender, boolean isFighting, boolean areEarsCut) {
        super(name, age, gender);
        this.isFighting = isFighting;
        this.areEarsCut = areEarsCut;
    }

//    Draw
    @Override
    protected void draw() {
        super.draw();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fighting dog: ").append(getisFighting()).append('\n')
                .append("Ears are cut: ").append(getAreEarsCut()).append('\n')
                .append('\n');
        System.out.print(stringBuilder);
    }

    public String getAreEarsCut() {
        if(areEarsCut) {
            return "Yes";
        }
        return "No";
    }

    public String getisFighting() {
        if(isFighting) {
            return "Yes";
        }
        return "No";
    }
}
