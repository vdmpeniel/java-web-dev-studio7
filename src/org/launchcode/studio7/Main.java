package org.launchcode.studio7;

import java.io.IOException;

public class Main {

    public static void main(String[] args){
        CD myNewCD = new CD("My Love Songs",
                "OOO! my love, my darling...");

        DVD myNewDVD = new DVD("My Sci-Fi movies 1", 570,  "Avatar, I am Legend...");

        myNewCD.report();
        System.out.println("----------------->");
        System.out.println(myNewCD.read());

        System.out.println("----------------->");
        try {
            myNewDVD.write("");
        } catch (IOException ioe){
            System.out.println("Error: you tried overwriting a closed disc: " + ioe.getMessage());
        }

        System.out.println("----------------->");
        System.out.println(myNewDVD.read());

    }
}
