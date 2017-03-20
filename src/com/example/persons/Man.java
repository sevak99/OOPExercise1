package com.example.persons;

import com.example.cloths.man_cloths.downDress.DownDress;
import com.example.cloths.man_cloths.hat.Hat;
import com.example.cloths.man_cloths.shoes.Shoes;
import com.example.cloths.man_cloths.topDress.TopDress;
import com.example.pets.Cat;
import com.example.pets.Dog;
import com.sun.corba.se.impl.oa.toa.TOA;

/**
 * Created by СЕВАК on 19.03.2017.
 */
public class Man extends Person {

    Shoes shoes;
    DownDress downDress;
    Hat hat;
    TopDress topDress;
    Cat cat;
    Dog dog;


    public Man(String first_name, String last_name, int age, String hairColor, String eyeColor, int height, int weight) {
        super(first_name, last_name, age, hairColor, eyeColor, height, weight);
    }

    @Override
    public void draw() {
        super.draw();
        if(shoes == null) {
            System.out.println("Shoes: No Shoes");
        } else shoes.draw();
        if(downDress == null) {
            System.out.println("DownDress: No DownDress");
        } else downDress.draw();
        if(hat == null) {
            System.out.println("Hat: No Hat");
        } else hat.draw();
        if(topDress == null) {
            System.out.println("TopDress: No TopDress");
        } else topDress.draw();

//        if(cat == null && dog == null) System.out.println("Has ets: No");
//        else if(cat != null) cat.draw();
    }

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
    public void setCat(Cat cat) {
        this.cat = cat;
    }
    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
