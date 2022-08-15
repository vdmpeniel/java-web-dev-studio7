package org.launchcode.studio7;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public abstract class RewritableDisk extends BaseDataDisc implements Rewritable{
    public RewritableDisk(String label, int storageCapacity) {
        super(label, storageCapacity);
    }

    public RewritableDisk(String label, int storageCapacity, String content) {
        super(label, storageCapacity, content);
    }

    public RewritableDisk(String label, int spinSpeed, int storageCapacity) {
        super(label, spinSpeed, storageCapacity);
    }

    public RewritableDisk(String label, int spinSpeed, int storageCapacity, String content) {
        super(label, spinSpeed, storageCapacity, content);
    }

    @Override
    public void rewrite(String newContent) throws IOException {
        erase();
        write(newContent);
    }

    @Override
    public void erase() throws IOException{
        System.out.println(String.format("Erasing %s disk...", getType()));
        setContent("");
    }


}
