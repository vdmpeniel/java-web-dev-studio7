package org.launchcode.studio7;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public abstract class BaseDataDisc extends BaseDisk implements DataDisc {

    private int storageCapacity;
    private byte[] content;
    private String label;


    public BaseDataDisc(String label, int storageCapacity) {
        super(0);
        this.storageCapacity = storageCapacity;
        this.label = label;
        this.content = new byte[storageCapacity * 1024];
    }
    public BaseDataDisc(String label, int storageCapacity, String content) {
        super(0);
        this.storageCapacity = storageCapacity;
        this.content = content.getBytes(StandardCharsets.UTF_8);
    }
    public BaseDataDisc(String label, int spinSpeed, int storageCapacity) {
        super(spinSpeed);
        this.storageCapacity = storageCapacity;
        this.label = label;
        this.content = new byte[storageCapacity * 1024];
    }
    public BaseDataDisc(String label, int spinSpeed, int storageCapacity, String content) {
        super(spinSpeed);
        this.storageCapacity = storageCapacity;
        this.content = content.getBytes(StandardCharsets.UTF_8);
    }

    public void setRotationSpeed(int rotationSpeed){
        System.out.println("You can't change the rotation speed of a data disk.");
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public String getLabel(){
        return label;
    }
    protected void setContent(String newContent){
        content = newContent.getBytes(StandardCharsets.UTF_8);
    }

    @Override
    public String read() {
        spin();
        System.out.println(String.format("Reading %s.", getType()));
        return new String(content, StandardCharsets.UTF_8);
    }

    @Override
    public void write(String newContent) throws IOException {
        if(content.length > 0) throw new IOException("Can't write closed disk.");
        System.out.println(String.format("Writing data on to %s.", getType()));
        setContent(newContent);
    }

    public void report(){
        System.out.println(String.format("Label: %s.", label));
        System.out.println(String.format("Disk Type: %s.", getType()));
        System.out.println(String.format("Rotation Speed: %d RPM.", getRotationSpeed()));
        System.out.println(String.format("Capacity: %d MBs", storageCapacity));
        System.out.println(String.format("Free Space: %d MBs.", (storageCapacity - content.length / 1024)));
    }
}
