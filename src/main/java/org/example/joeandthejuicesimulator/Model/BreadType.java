package org.example.joeandthejuicesimulator.Model;

public enum BreadType {

    WHOLE_WHEAT("Whole Wheat"),
    SOURDOUGH("Sourdough"),
    RYE("Rye"),
    WHITE("White"),
    MULTIGRAIN("Multigrain"),
    BAGUETTE("Baguette"),
    CIABATTA("Ciabatta"),
    FOCACCIA("Focaccia"),
    BRIOCHE("Brioche"),
    PITA("Pita");

    private String displayName;

    BreadType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
