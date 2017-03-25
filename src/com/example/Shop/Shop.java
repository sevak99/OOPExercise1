package com.example.Shop;

import com.example.cloths.Cloth;

/**
 * Created by СЕВАК on 24.03.2017.
 */
public class Shop{

    private int numberOfCloths;
    private Cloth[] cloth;
    private static int num = 0;

//    Constructor
    public Shop(int numberOfCloths) {
        this.numberOfCloths = numberOfCloths;
        cloth = new Cloth[numberOfCloths];
    }

//    Setters
    public void setCloth(Cloth cloth) {
        if(num == numberOfCloths) {
            System.out.println("There is No place");
            return;
        }
        this.cloth[num++] = cloth;
        if(cloth.getPrice() < 0) {
            System.out.println(String.format("Warning: The price of %s is negative\n", cloth.getName()));
            delete(cloth);
        }
    }

    public void delete (Cloth delcloth) {
        for(int i = 0; i < num; i++) {
            if(cloth[i] == delcloth) {
                for (int j = i; j < num - 1; j++) {
                    cloth[j] = cloth[j + 1];
                }
                i--;
                num--;
            }
        }
    }

//    Print
    public void printNamesOfCloths() {
        if(num == 0) System.out.println("No Cloth");
        for (int i =0; i < num; i++) {
            System.out.println(cloth[i].getName());
        }
        System.out.println();
    }

    public void printPrice() {

        System.out.println(String.format("Price: %.2f\n",getPrice()));
    }

    private double getPrice() {

        double price = 0;

        for(int i = 0; i < num; i++) {
                price += cloth[i].getPrice();
        }
        return price;
    }
}
