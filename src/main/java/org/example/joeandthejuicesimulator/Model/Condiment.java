package org.example.joeandthejuicesimulator.Model;

public enum Condiment {
    KETCHUP("Ketchup"),
    MUSTARD("Mustard"),
    MAYO("Mayonnaise"),
    BBQ_SAUCE("BBQ Sauce"),
    HOT_SAUCE("Hot Sauce"),
    RANCH("Ranch"),
    HONEY_MUSTARD("Honey Mustard"),
    CHIPOTLE_MAYO("Chipotle Mayo"),
    AIOLI("Aioli"),  // Garlic is implied here
    TERIYAKI_SAUCE("Teriyaki Sauce");

    private final String displayCondiments;

    Condiment(String displayCondiments) {
        this.displayCondiments = displayCondiments;
    }

    public String displayCondiments() {
        return displayCondiments;
    }
}
