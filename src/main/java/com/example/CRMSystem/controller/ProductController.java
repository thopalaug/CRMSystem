package com.example.CRMSystem.controller;

import com.example.CRMSystem.model.ProductData;
import com.example.CRMSystem.service.ProductService;
import com.example.CRMSystem.util.Mappings;
import com.example.CRMSystem.util.ViewNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

    // -- Fields --
    private final ProductService productService;

    // -- Constructor
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @ModelAttribute
    public ProductData productData(){
        return productService.getData();
    }


    // -- Request Methods --
    @GetMapping(Mappings.PRODUCT)
    public ModelAndView getProducts(){
        ModelAndView mav = new ModelAndView(ViewNames.PRODUCT);
        mav.addObject("product", productService.getData());
        return mav;
    }

}
