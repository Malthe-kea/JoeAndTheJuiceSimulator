package org.example.joeandthejuicesimulator.Repository;

import org.example.joeandthejuicesimulator.Model.SandwichOrder;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Repository
public class SandwichRepository {

    private List<SandwichOrder> sandwichOrderList;

    public SandwichRepository(List<SandwichOrder> sandwichOrderList) {
        this.sandwichOrderList = sandwichOrderList;
    }

    public List<SandwichOrder> placeOrder(SandwichOrder sandwichOrder){
        sandwichOrderList.add(sandwichOrder);
        return sandwichOrderList;
    }

    public List<SandwichOrder> getSandwichOrderList() {
        return sandwichOrderList;
    }

    public SandwichOrder getSandwichOrderById(UUID id) {
        for (SandwichOrder s : sandwichOrderList) {
            if (s.getOrderId() != null && s.getOrderId().equals(id)) {
                return s;
            }
        }
        return null;
    }

}
