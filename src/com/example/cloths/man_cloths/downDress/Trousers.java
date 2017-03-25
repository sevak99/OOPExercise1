package com.example.cloths.man_cloths.downDress;

/**
 * Created by СЕВАК on 21.03.2017.
 */
public class Trousers extends DownDress {

    private String fit;
//    Constructor
    public Trousers(String brand, String color, int size, double price, String material, String fit) {

        super(brand, color, size, price,"Trousers", material);
        this.fit = fit;
    }

//    Draw
    @Override
    protected void draw() {
        super.draw();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fit: ").append(getFit()).append('\n')
                .append('\n');
        System.out.print(stringBuilder);
    }

    private String getFit() {
        return fit;
    }
}
