package org.launchcode.studio7;

import java.io.IOException;

public interface Rewritable extends Writable{
    void rewrite(String newContent) throws IOException;
    void erase() throws IOException;
}
