package org.launchcode.studio7;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public abstract class BaseDisc implements OpticalDisc{
    private final int spinSpeed;
    private int storageCapacity; // in MBs
    private byte[] content;
    private final String type = this.getClass().getSimpleName().toUpperCase();
    private String label;


    public BaseDisc(String label, int storageCapacity) {
        this.spinSpeed = 0;
        this.storageCapacity = storageCapacity;
        this.label = label;
        this.content = new byte[storageCapacity * 1024];
    }
    public BaseDisc(String label, int storageCapacity, String content) {
        this.spinSpeed = 0;
        this.storageCapacity = storageCapacity;
        this.content = content.getBytes(StandardCharsets.UTF_8);
    }

    public BaseDisc(String label, int spinSpeed, int storageCapacity) {
        this.spinSpeed = spinSpeed;
        this.storageCapacity = storageCapacity;
        this.label = label;
        this.content = new byte[storageCapacity * 1024];
    }
    public BaseDisc(String label, int spinSpeed, int storageCapacity, String content) {
        this.spinSpeed = spinSpeed;
        this.storageCapacity = storageCapacity;
        this.content = content.getBytes(StandardCharsets.UTF_8);
    }



    public int getSpinSpeed() {
        return spinSpeed;
    }
//    private void setSpinSpeed(int spinSpeed) {
//        this.spinSpeed = spinSpeed;
//    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    @Override
    public String read() {
        spin();
        System.out.println(String.format("Reading %s.", type));
        return new String(content, StandardCharsets.UTF_8);
    }

    @Override
    public void spin() {
        System.out.println(String.format("Disk type: %s.", type));
        System.out.println(String.format("Spinning at %d RPM", spinSpeed));
    }

    @Override
    public void write(String content) throws IOException {
        if(this.content.length > 0) throw new IOException("Can't write closed disk.");
        System.out.println(String.format("Writing data on to %s.", type));
        this.content = content.getBytes(StandardCharsets.UTF_8);
    }

    public void report(){
        System.out.println(String.format("Label: %s.", label));
        System.out.println(String.format("Disk Type: %s.", type));
        System.out.println(String.format("Rotation Speed: %d RPM.", spinSpeed));
        System.out.println(String.format("Capacity: %d MBs", this.storageCapacity));
        System.out.println(String.format("Free Space: %d MBs.", (storageCapacity - content.length / 1024)));
    }
}
