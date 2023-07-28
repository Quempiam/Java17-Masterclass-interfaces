package dev.que;

import java.util.List;

public interface ISaveable {
    List<String> write ();
    void read(List<String> save);
}
