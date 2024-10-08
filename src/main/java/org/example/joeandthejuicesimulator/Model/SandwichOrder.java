package org.example.joeandthejuicesimulator.Model;

import java.util.List;
import java.util.UUID;

public class SandwichOrder {
    private Topping topping;
    private Size size;
    private BreadType breadType;
    private Condiment condiment;
    private UUID orderId;

    public SandwichOrder(Topping topping, Size size, BreadType breadType, Condiment condiment) {
        this.topping = topping;
        this.size = size;
        this.breadType = breadType;
        this.condiment = condiment;
    }

    public SandwichOrder() {
        if(orderId == null){
        this.orderId = UUID.randomUUID();
        }
    }

    public Topping getTopping() {
        return topping;
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

    public Condiment getCondiment() {
        return condiment;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    public void setBreadType(BreadType breadType) {
        this.breadType = breadType;
    }

    public void setCondiment(Condiment condiment) {
        this.condiment = condiment;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }
}
