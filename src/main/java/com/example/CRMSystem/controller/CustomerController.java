package com.example.CRMSystem.controller;

import com.example.CRMSystem.model.Customer;
import com.example.CRMSystem.model.CustomerData;
import com.example.CRMSystem.service.CustomerService;
import com.example.CRMSystem.util.AttributeNames;
import com.example.CRMSystem.util.Mappings;
import com.example.CRMSystem.util.ViewNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

    // -- Fields --
    private final CustomerService customerService;


    // -- Constructor
    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    // -- Model Attributes --
    @ModelAttribute
    public CustomerData customerData(){
        return customerService.getData();
    }

    // -- Request Methods --
    @GetMapping(Mappings.CUSTOMER)
    public ModelAndView getCustomers(){
        ModelAndView mav = new ModelAndView(ViewNames.CUSTOMER);
        mav.addObject("customer", customerService.getData());
        return mav;
    }

    @GetMapping(Mappings.ADD_CUSTOMER)
    public String addCustomer(Model model){
        Customer customer = new Customer();
        model.addAttribute(AttributeNames.CUSTOMER, customer);
        return ViewNames.ADD_CUSTOMER;
    }

    @PostMapping(Mappings.CUSTOMER)
    public String addCustomer(@ModelAttribute(AttributeNames.CUSTOMER) Customer customer){
        if(customer.getId() == 0){
            customerService.addCustomer(customer);
        }else{
            customerService.updateCustomer(customer);
        }
        return Mappings.CUSTOMER;
    }

    @GetMapping("/{id}")
    public String editCustomer(@PathVariable int id, Model model){
        Customer customer = customerData().getCustomer(id);
        model.addAttribute(AttributeNames.CUSTOMER, customer);
        return ViewNames.EDIT_CUSTOMER;
    }


    @GetMapping(Mappings.DELETE_CUSTOMER)
    public String deleteCustomer(@RequestParam int id){
        customerService.deleteCustomer(id);
        return "redirect:/" + Mappings.CUSTOMER;
    }

}
