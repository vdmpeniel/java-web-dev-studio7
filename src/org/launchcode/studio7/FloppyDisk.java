package org.launchcode.studio7;

public class FloppyDisk extends RewritableDisk{
    public FloppyDisk(String label) {
        super(label, 300, 512);
    }

    public FloppyDisk(String label, String content) {
        super(label, 300, 512, content);
    }

    private FloppyDisk(String label, int storageCapacity) {
        super(label, 300, storageCapacity);
    }

    private FloppyDisk(String label, int storageCapacity, String content) {
        super(label, 300, storageCapacity, content);
    }

    private FloppyDisk(String label, int spinSpeed, int storageCapacity) {
        super(label, spinSpeed, storageCapacity);
    }

    private FloppyDisk(String label, int spinSpeed, int storageCapacity, String content) {
        super(label, spinSpeed, storageCapacity, content);
    }
}
