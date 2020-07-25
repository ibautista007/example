package com.company;

import javax.swing.*;

public class Exception1 {

    public static void main(String[] args) {
	// write your code here

        Menu obj1 = new Menu();
        String guestchoice = "";

        try{
            Pickmenu selection = new Pickmenu(obj1);
            guestchoice = selection.getGuestchoice();

            if(guestchoice.equals("Marine Lobster")){
                throw new Exception2("Congratulations yout chose Marine Lobster, You win a coupon");
            }

        }
        catch (Exception2 xx){
            JOptionPane.showMessageDialog(null,xx.getMessage());
        }
        catch (Exception error){
            guestchoice = " Invalid selection-";
        }

        JOptionPane.showMessageDialog(null,"you chose" + guestchoice);

    while(true) {

        try {
            Vegetarian veg1 = new Vegetarian();
            Pickmenu selection = new Pickmenu(veg1);
            guestchoice = selection.getGuestchoice();
            break;
        } catch (Exception error) {
            guestchoice = " Invalid selection-";
            JOptionPane.showMessageDialog(null, "you chose" + guestchoice);
        }


    }
        JOptionPane.showMessageDialog(null, "you chose" + guestchoice);
    }
}
