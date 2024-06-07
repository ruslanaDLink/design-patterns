package patterns.structural.bridge.implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class LinkedHashMapTest {
    private LinkedHashMap<OperatingSystem> collection;

    @BeforeEach
    void setUp() throws Exception {
        collection = new LinkedHashMap<>(new ArrayList<>(5));
    }

    @Test
    void add() {
        collection.add(OperatingSystem.WINDOWS);
        collection.add(OperatingSystem.LINUX);
        collection.add(OperatingSystem.FEDORA);
        collection.add(OperatingSystem.UBUNTU);
        collection.add(OperatingSystem.MacOS);

        Assertions.assertNotNull(collection, "Collection is empty.");
    }

    @Test
    void remove() {
        add();
        OperatingSystem windows = OperatingSystem.WINDOWS;
        collection.remove(windows);

        Assertions.assertFalse(collection.contains(windows), "Failed to remove enum value " + windows);

    }

    private enum OperatingSystem {
        LINUX,
        WINDOWS,
        UBUNTU,
        MacOS,
        FEDORA
    }
}