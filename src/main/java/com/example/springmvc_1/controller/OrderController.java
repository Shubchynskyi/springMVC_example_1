package com.example.springmvc_1.controller;

import com.example.springmvc_1.entity.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/order")
@SessionAttributes("order")
public class OrderController {

    @GetMapping
    public String orderForm() {
        return "order";
    }

    @PostMapping
    public String processOrder(Order order,
                               SessionStatus sessionStatus) {
        sessionStatus.setComplete();

        return "redirect:/index";
    }

}
