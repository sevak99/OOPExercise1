package com.example.pets;

/**
 * Created by СЕВАК on 19.03.2017.
 */
public class Pet {

    private String name;
    private int age;
    private boolean male;
    private String _pet;

//    Constructor
    protected Pet(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.male = gender;
    }

//    Print
    public void print() {

        if(this instanceof Cat) {
            _pet = "Cat";
            ((Cat) this).draw();
        }
        if(this instanceof Dog) {
            _pet = "Dog";
            ((Dog) this).draw();
        }
    }

//    Draw

    protected void draw() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Pet: ").append(_pet).append('\n')
                .append("Name: ").append(getName()).append('\n')
                .append("Age: ").append(getAge()).append('\n')
                .append("Gender: ").append(getGender()).append('\n');

        System.out.print(stringBuilder);
    }

    private String getName() {
        return name;
    }

    private String getAge() {
        return new Integer(age).toString();
    }

    private String getGender() {
        if(male) return "Male";
        return "Female";
    }
}
