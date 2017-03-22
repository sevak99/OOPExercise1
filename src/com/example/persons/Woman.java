package com.example.persons;

import com.example.Tattoo_and_MakeUp.MakeUp;
import com.example.cloths.man_cloths.downDress.DownDress;
import com.example.cloths.man_cloths.hat.Hat;
import com.example.cloths.man_cloths.shoes.Shoes;
import com.example.cloths.man_cloths.topDress.TopDress;
import com.example.pets.Pet;

/**
 * Created by СЕВАК on 19.03.2017.
 */
public class Woman extends Person {

    private Shoes shoes;
    private DownDress downDress;
    private Hat hat;
    private TopDress topDress;
    private Pet pet;
    private boolean alreadyHavePet = false;
    private MakeUp makeUp;

//    Constructor
    public Woman(String first_name, String last_name, int age, String hairColor, String eyeColor, int height, int weight) {
        super(first_name, last_name, age, hairColor, eyeColor, height, weight);
    }

//    Setters
    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }
    public void setDownDress(DownDress downDress) {
        this.downDress = downDress;
    }
    public void setHat(Hat hat) {
        this.hat = hat;
    }
    public void setTopDress(TopDress topDress) {
        this.topDress = topDress;
    }
    public void setPet(Pet pet) {
        if(this.pet == null) { this.pet = pet; }
        else { alreadyHavePet = true; }
    }
    public void setMakeUp(MakeUp makeUp) { this.makeUp = makeUp; }

//    Draw
    @Override
    public void draw() {
        super.draw();
        if(shoes == null) {
            System.out.println("Shoes: No Shoes\n");
        } else shoes.print();
        if(downDress == null) {
            System.out.println("Down Dress: No DownDress\n");
        } else downDress.print();
        if(hat == null) {
            System.out.println("Hat: No Hat\n");
        } else hat.print();
        if(topDress == null) {
            System.out.println("Top Dress: No TopDress\n");
        } else topDress.print();
        if(makeUp == null) {
            System.out.println("Make up: No make up\n");
        } else makeUp.draw();

        pet.print(alreadyHavePet);
    }

//    Go Out
    public void goOut() {
        if(shoes == null) {
            System.out.println("I cannot go out naked");
        } else if(downDress == null) {
            System.out.println("I cannot go out naked");
        } else if(topDress == null) {
            System.out.println("I cannot go out naked");
        } else if (makeUp == null) {
            System.out.println("I cannot go out without make up");
        } else System.out.println("I look great, going out");
        System.out.println();
    }
}
