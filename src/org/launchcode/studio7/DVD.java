package org.launchcode.studio7;

import java.io.IOException;

public class DVD extends BaseDataDisc {


    public DVD(String label, int spinSpeed) {
        super(label,
                (spinSpeed < 570)? 570
                        : (spinSpeed > 1600)? 1600
                        : spinSpeed,
                4096
        );
    }
    public DVD(String label, int spinSpeed, String content) {
        super(label,
                (spinSpeed < 570)? 570
                        : (spinSpeed > 1600)? 1600
                        : spinSpeed,
                4096,
                content
        );
    }

    private int limitSpinSpeed(int speed){
        return (speed < 570)? 570
                : (speed > 1600)? 1600
                : speed;
    }

    @Override
    public String read() {
        System.out.println("Old but nice!");
        return super.read();
    }

    @Override
    public void spin() {
        System.out.println("This is what I am talking about!");
        super.spin();
    }

    @Override
    public void write(String content) throws IOException {
        System.out.println("Meh! still quite slow. Go get some coffee.");
        super.write(content);
    }

    @Override
    public void report() {
        System.out.println("DVD Disk Report:");
        super.report();
    }

}
