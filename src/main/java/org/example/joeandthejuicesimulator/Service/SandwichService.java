package org.example.joeandthejuicesimulator.Service;

import org.example.joeandthejuicesimulator.Model.SandwichOrder;
import org.example.joeandthejuicesimulator.Repository.SandwichRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SandwichService {

    private SandwichRepository sandwichRepository;
    public SandwichService(SandwichRepository sandwichRepository) {
        this.sandwichRepository = sandwichRepository;
    }

    public void placeOrder(SandwichOrder sandwichOrder) {
        if (sandwichOrder.getOrderId() != null) {
            SandwichOrder existingOrder = sandwichRepository.getSandwichOrderById(sandwichOrder.getOrderId());
            if (existingOrder != null) {
                // Update existing order fields
                existingOrder.setTopping(sandwichOrder.getTopping());
                existingOrder.setSize(sandwichOrder.getSize());
                existingOrder.setBreadType(sandwichOrder.getBreadType());
                existingOrder.setCondiment(sandwichOrder.getCondiment());
                // You don't need to add it back to the list, as you're modifying the existing object
                return;
            }
        }
        // If orderId is null or the order doesn't exist, create a new order
        sandwichOrder.setOrderId(UUID.randomUUID());
        sandwichRepository.placeOrder(sandwichOrder);
    }


    public List<SandwichOrder> getSandwichOrderList(){
        return sandwichRepository.getSandwichOrderList();
    }

    public SandwichOrder getSandwichOrderById(UUID id){
        return sandwichRepository.getSandwichOrderById(id);
    }

}
