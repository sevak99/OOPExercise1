package com.example;

import com.example.Tattoo_and_MakeUp.MakeUp;
import com.example.cloths.Cloth;
import com.example.cloths.man_cloths.downDress.Trousers;
import com.example.cloths.man_cloths.hat.Cap;
import com.example.cloths.man_cloths.shoes.Sneakers;
import com.example.cloths.man_cloths.topDress.TShirt;
import com.example.persons.Man;
import com.example.persons.Woman;
import com.example.pets.Cat;
import com.example.pets.Dog;

/**
 * Created by СЕВАК on 19.03.2017.
 */
public class Main {

    public static void main(String[] args) {

        Man man1 = new Man(
                "James",
                "Bond",
                40,
                "Black",
                "Brown",
                178,
                75);

        Woman woman = new Woman(
                "Ann",
                "Tomson",
                35,
                "Brown",
                "Black",
                170,
                64);

        Trousers trousers = new Trousers(
                "Pull & Bear",
                "Blue",
                38,
                20000,
                "Slim Fit"
        );

        TShirt tShirt = new TShirt(
                "Celio",
                "White",
                95,
                8000,
                "Short Sleeves"
        );

        Sneakers sneakers = new Sneakers(
                "Pull & Bear",
                "Grey",
                40,
                25000,
                "Summer",
                "EveryDay"
        );

        Cap cap = new Cap(
                "Puma",
                "Blue",
                12,
                22000,
                "Modern. With printings"
        );

        Dog dog = new Dog(
                "Rex",
                3,
                false,
                true,
                false
        );

        Cat cat = new Cat(
                "Kuzya",
                2,
                true,
                "Green"
        );

        man1.setShoes(sneakers);
        man1.setDownDress(trousers);
        man1.setHat(cap);
        man1.setPet(cat);

        man1.draw();
        man1.goOut();

        woman.setShoes(sneakers);
        woman.setDownDress(trousers);
        woman.setTopDress(tShirt);
        woman.setPet(dog);

        woman.draw();
        woman.goOut();

        MakeUp makeUp = new MakeUp(
                "Red"
        );

        woman.setMakeUp(makeUp);

        woman.draw();
        woman.goOut();

        man1.setPet(dog);
        man1.setTopDress(tShirt);

        man1.draw();
        man1.goOut();

    }
}
