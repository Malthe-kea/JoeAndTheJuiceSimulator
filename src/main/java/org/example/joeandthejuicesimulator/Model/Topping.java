package org.example.joeandthejuicesimulator.Model;

public enum Topping {

    LETTUCE("Lettuce"),
    TOMATO("Tomato"),
    ONION("Onion"),
    PICKLES("Pickles"),
    CUCUMBER("Cucumber"),
    AVOCADO("Avocado"),
    BACON("Bacon"),
    CHEDDAR_CHEESE("Cheddar Cheese"),
    MOZZARELLA("Mozzarella"),
    SWISS_CHEESE("Swiss Cheese"),
    SPINACH("Spinach"),
    ARUGULA("Arugula"),
    OLIVES("Olives"),
    ROASTED_PEPPERS("Roasted Peppers"),
    JALAPENOS("Jalapeños"),
    MUSHROOMS("Mushrooms"),
    TURKEY("Turkey"),
    HAM("Ham"),
    CHICKEN_BREAST("Chicken Breast"),
    SALAMI("Salami"),
    PEPPERONI("Pepperoni");

    private String displayToppings;

    Topping(String displayToppings) {
        this.displayToppings = displayToppings;
    }

    public String displayToppings() {
        return displayToppings;
    }
}
