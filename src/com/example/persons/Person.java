package com.example.persons;

import com.example.pets.Cat;
import com.example.pets.Dog;

/**
 * Created by СЕВАК on 19.03.2017.
 */
public class Person {

    public String first_name;
    public String last_name;
    public int age;
    public String hairColor;
    public String eyeColor;
    public int height;
    public int weight;
    Cat cat;
    Dog dog;

    public Person(String first_name, String last_name, int age, String hairColor, String eyeColor, int height, int weight){

        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.height = height;
        this.weight = weight;

    }

    public void draw(){

        System.out.println(
                "Name: " + first_name + " " + last_name + "\n" +
                "Age: " + age + "\n" +
                "Hair Color: " + hairColor + "\n" +
                "Eye Color: " + eyeColor + "\n" +
                "Height: " + height + "sm\n" +
                "Weight: " + weight + "kg\n");

    }

}
