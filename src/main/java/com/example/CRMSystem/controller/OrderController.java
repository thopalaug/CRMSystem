package com.example.CRMSystem.controller;

import com.example.CRMSystem.model.OrderData;
import com.example.CRMSystem.service.OrderService;
import com.example.CRMSystem.util.Mappings;
import com.example.CRMSystem.util.ViewNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrderController {

    // -- Fields --
    private final OrderService orderService;

    // -- Constructor
    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @ModelAttribute
    public OrderData orderData(){
        return orderService.getData();
    }

    // -- Request Methods --
    @GetMapping(Mappings.ORDER)
    public ModelAndView getOrders(){
        ModelAndView mav = new ModelAndView(ViewNames.ORDER);
        mav.addObject("order", orderService.getData());
        return mav;
    }

}
