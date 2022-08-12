package org.launchcode.studio7;

import java.io.IOException;

public class CD extends BaseDisc{
    private int storageCapacity;

    private CD(String label, int spinSpeed, int storageCapacity) {
        super(label, spinSpeed, storageCapacity);
    }
    private CD(String label, int spinSpeed, int storageCapacity, String content) {
        super(label, spinSpeed, storageCapacity);
    }

    public CD(String label) {
        super(label, 700);
    }

    public CD(String label, String content) {
        super(label, 500, 700, content);
    }



    @Override
    public String read() {
        System.out.println("Reading: You like slow stuff HUH?");
        return super.read();
    }

    @Override
    public void spin() {
        System.out.println("Spinning: I mean slooooooowww.");
        super.spin();
    }

    @Override
    public void write(String content) throws IOException {
        System.out.println("You like slow stuff HUH? Here we go. Go get some coffee.");
        super.write(content);
    }

    @Override
    public void report() {
        System.out.println("You like slow stuff HUH? Cute! CD Disk Report!");
        super.report();
    }


}
