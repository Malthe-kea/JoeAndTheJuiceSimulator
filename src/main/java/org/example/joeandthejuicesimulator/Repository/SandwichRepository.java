package org.example.joeandthejuicesimulator.Repository;

import org.example.joeandthejuicesimulator.Model.SandwichOrder;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SandwichRepository {

    private List<SandwichOrder> sandwichOrderList = new ArrayList<>();

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
}
