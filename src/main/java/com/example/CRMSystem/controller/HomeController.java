package com.example.CRMSystem.controller;

import com.example.CRMSystem.util.Mappings;
import com.example.CRMSystem.util.ViewNames;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // -- Fields --

    // -- Constructor --
    public HomeController() {
    }



    // -- Request Methods --
    @GetMapping(Mappings.HOME)
    public String home() {
        return ViewNames.HOME;
    }



}
