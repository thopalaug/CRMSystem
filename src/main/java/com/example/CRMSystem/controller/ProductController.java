package com.example.CRMSystem.controller;

import com.example.CRMSystem.util.Mappings;
import com.example.CRMSystem.util.ViewNames;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    // -- Fields --

    // -- Constructor
    public ProductController() {
    }

    // -- Request Methods --
    @GetMapping(Mappings.PRODUCT)
    public String product(){
        return ViewNames.PRODUCT;
    }

}
