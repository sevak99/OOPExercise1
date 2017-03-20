package com.example;

import com.example.cloths.Cloth;

/**
 * Created by СЕВАК on 19.03.2017.
 */
public class Main {

    public static void main(String[] args) {

        Cloth cloth = new Cloth(
                "Pull & Bear",
                "Man Cloth",
                40,
                25000,
                "Man Cloth",
                "Shoes",
                "Sneakers"
        );

        cloth.draw();

    }
}
