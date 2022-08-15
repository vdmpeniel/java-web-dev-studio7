package org.launchcode.studio7;

public class VinylRecord extends BaseDataDisc {
    private VinylRecord(String label, int storageCapacity) {
        super(label, 78, storageCapacity);
    }

    public VinylRecord(String label, int storageCapacity, String content) {
        super(label, 78, storageCapacity, content);
    }

    private VinylRecord(String label, int spinSpeed, int storageCapacity) {
        super(label, spinSpeed, storageCapacity);
    }

    private VinylRecord(String label, int spinSpeed, int storageCapacity, String content) {
        super(label, spinSpeed, storageCapacity, content);
    }
    public void report(){
        System.out.println(String.format("Label: %s.", this.getLabel()));
        System.out.println(String.format("Disk Type: %s.", this.getType()));
        System.out.println(String.format("Rotation Speed: %d RPM.", this.getRotationSpeed()));
        System.out.println(String.format("Capacity: %d minutes", this.getStorageCapacity()));
        System.out.println(String.format("Free Space: %d minutes.", (this.getStorageCapacity() - this.read().length() / 2000)));
    }
}
