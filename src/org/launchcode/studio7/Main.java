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
            myNewDVD.write("Hello error!");
        } catch (IOException ioe){
            System.out.println("Error: you tried overwriting a closed disc: " + ioe.getMessage());
        }

        System.out.println("----------------->");
        System.out.println(myNewDVD.read());

        System.out.println("-------------------------------------------------->");
        VinylRecord myVinyl = new VinylRecord("Oldies", 23, "Some old songs from the 60's");
        System.out.println(myVinyl.getRotationSpeed());
        System.out.println(myVinyl.read());

        FloppyDisk myFloppy = new FloppyDisk("My arcade games", "Tetris, Doom, Dave, Prince of Persia");
        System.out.println(myFloppy.getRotationSpeed());
        System.out.println(myFloppy.read());
        try {
            myFloppy.erase();
            System.out.println("After erasing: " + myFloppy.read());

            myFloppy.write("Some mp3 songs...");
            System.out.println(myFloppy.read());

            myFloppy.read();
        } catch (IOException e){
            System.out.println("Error!");
        }

        System.out.println("------------------------------------------->");
        Wheel myWheel = new Wheel(30);
        myWheel.setRotationSpeed(100);
        System.out.println(myWheel.getType());
        System.out.println(myWheel.getRotationSpeed());

        System.out.println("------------------------------------------->");
        Frisbee myFrisbee = new Frisbee(200);
        System.out.println(myFrisbee.getType());
        myFrisbee.fly();


    }
}
