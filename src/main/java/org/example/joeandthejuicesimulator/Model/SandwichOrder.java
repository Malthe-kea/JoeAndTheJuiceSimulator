package org.example.joeandthejuicesimulator.Model;

public class SandwichOrder {
    private Topping topping;
    private Size size;
    private BreadType breadType;

    public SandwichOrder(Topping topping, Size size, BreadType breadType) {
        this.topping = topping;
        this.size = size;
        this.breadType = breadType;
    }

    public SandwichOrder() {
    }

    public Topping getTopping() {
        return topping;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public BreadType getBreadType() {
        return breadType;
    }

    public void setBreadType(BreadType breadType) {
        this.breadType = breadType;
    }
}
