package com.company;
import javax.swing.*;


public class Menu {
    protected String[] choices = {"Rosemary","Beef Wellington", "Marine Lobster"};

    private String menu = "";
    private int choice;

    public String displaym(){

        for(int x=0; x<choices.length;x++){

            menu = menu+"\n"+(x+1)+" for " + choices[x];

        }
        String input = JOptionPane.showInputDialog(null,"Type your selection and press enter"+menu);
        choice = Integer.parseInt(input);

        return(choices[choice-1]);

    }





}
