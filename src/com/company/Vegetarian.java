package com.company;

public class Vegetarian extends Menu {

    String[] veg = {"Spinach Lasagna","Cheese Enchilda","Samosa"};

    public Vegetarian(){

        super();

        for(int x=0; x<veg.length;x++){

            choices[x] = veg[x];

        }

    }


}
