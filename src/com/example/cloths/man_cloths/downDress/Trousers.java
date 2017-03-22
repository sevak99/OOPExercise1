package com.example.cloths.man_cloths.downDress;

/**
 * Created by СЕВАК on 21.03.2017.
 */
public class Trousers extends DownDress {

    private String fit;
//    Constructor
    public Trousers(String brand, String color, int size, double price, String fit) {

        super(brand, color, size, price,"Trousers");
        this.fit = fit;
        whatType(this);
    }

//    Draw
    @Override
    protected void draw() {
        super.draw();
        System.out.print(
                String.format("Fit: %s\n\n", fit));
    }

}
