package org.example.joeandthejuicesimulator.Controller;

import org.example.joeandthejuicesimulator.Model.*;
import org.example.joeandthejuicesimulator.Service.SandwichService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.UUID;

@Controller()
public class SandwichController {
    private SandwichService sandwichService;
    public SandwichController(SandwichService sandwichService) {
        this.sandwichService = sandwichService;
    }

    @GetMapping("")
    public String showOrderForm(Model model){
        SandwichOrder sandwichOrder = new SandwichOrder();
        sandwichOrder.setSize(Size.LARGE);
        model.addAttribute("sandwichOrder", sandwichOrder);
        model.addAttribute("size",Size.values());
        model.addAttribute("breadType", BreadType.values());
        model.addAttribute("topping", Topping.getAllToppings());
        model.addAttribute("condiment", Condiment.values());
        return "order-form";
    }

    @PostMapping("/order")
    public String placeOrder(@ModelAttribute SandwichOrder sandwichOrder) {
        sandwichService.placeOrder(sandwichOrder);
        return "redirect:/orders";
    }

    @GetMapping("/orders")
    public String showOrders(Model model){
        model.addAttribute("orders", sandwichService.getSandwichOrderList());
        return "order-list";
    }

    @GetMapping("/order/edit/{id}")
    public String editOrder(@PathVariable UUID id, Model model) {
        SandwichOrder sandwichOrder = sandwichService.getSandwichOrderById(id);
        if (sandwichOrder == null) {
            throw new IllegalArgumentException("Invalid order ID");
        }

        model.addAttribute("sandwichOrder", sandwichOrder);
        model.addAttribute("size",Size.values());
        model.addAttribute("breadType", BreadType.values());
        model.addAttribute("topping", Topping.getAllToppings());
        model.addAttribute("condiment", Condiment.values());
        return "order-form";
    }

}
