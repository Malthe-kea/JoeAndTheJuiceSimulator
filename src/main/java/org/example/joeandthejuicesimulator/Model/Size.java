package org.example.joeandthejuicesimulator.Model;

public enum Size {

    SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large"),
    EXTRA_LARGE("Extra Large"),
    HALF("Half"),
    FOOTLONG("Footlong"),
    MINI("Mini");

    private String size;

    Size(String size) {
        this.size = size;
    }

    public String displaySize() {
        return size;
    }
}
