package com.company;

import javax.swing.*;

public class Pickmenu {

    private Menu briefmenu;
    private String guestchoice;

    public String getGuestchoice(){
        return guestchoice;
    }

    public Pickmenu(Menu themenu){
        briefmenu = themenu;
        setGuestchoice();
    }

    public void setGuestchoice() {
        JOptionPane.showMessageDialog(null, "Choice from the following menu.");
        guestchoice = briefmenu.displaym();
    }
}
