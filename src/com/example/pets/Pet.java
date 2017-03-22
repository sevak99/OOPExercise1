package com.example.pets;

/**
 * Created by СЕВАК on 19.03.2017.
 */
public class Pet {

    private String name;
    private int age;
    private boolean male;
    private Cat cat;
    private Dog dog;
    private String _pet;

//    Constructor
    protected Pet(String name, int age, boolean gender) {
        if(this.dog != null) {
            System.out.println("You already have one pet. You can not keep more than one pet");
        }
       // whatPet();
        this.name = name;
        this.age = age;
        this.male = gender;
    }


    protected void whatPet(Cat cat) {
        if(this.dog != null) {
            System.out.println("You already have one pet. You can not keep more than one pet");
        }
        this.cat = cat;
        _pet = "Cat";
    }
    protected void whatPet(Dog dog) {
        if(this.cat != null) {
            System.out.println("You already have one pet. You can not keep more than one pet");
        }
        this.dog = dog;
        _pet = "Dog";
    }
//    Print
    public void print(boolean havePet) {
        if(havePet) {
            System.out.println("Pet: You already have one pet. You can not keep more than one pet\n");
        }
        if(cat != null) {
            cat.draw();
        } else if (dog != null) {
            dog.draw();
        } else {
            System.out.println("Pet: No pet\n");
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
