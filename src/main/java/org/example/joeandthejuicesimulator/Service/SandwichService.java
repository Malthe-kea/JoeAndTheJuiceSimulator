package org.example.joeandthejuicesimulator.Service;

import org.example.joeandthejuicesimulator.Model.SandwichOrder;
import org.example.joeandthejuicesimulator.Repository.SandwichRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SandwichService {

    private SandwichRepository sandwichRepository;
    public SandwichService(SandwichRepository sandwichRepository) {
        this.sandwichRepository = sandwichRepository;
    }

    public List<SandwichOrder> placeOrder(SandwichOrder sandwichOrder) {
        return sandwichRepository.placeOrder(sandwichOrder);
    }

    public List<SandwichOrder> getSandwichOrderList(){
        return sandwichRepository.getSandwichOrderList();
    }

}
