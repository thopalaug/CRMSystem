package com.example.CRMSystem.controller;

import com.example.CRMSystem.util.Mappings;
import com.example.CRMSystem.util.ViewNames;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderController {

    // -- Fields --

    // -- Constructor
    public OrderController() {
    }

    // -- Request Methods --
    @GetMapping(Mappings.ORDER)
    public String order(){
        return ViewNames.ORDER;
    }

}
