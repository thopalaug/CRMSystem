package com.example.CRMSystem.util;

public class Mappings {

    // -- Constants --
    public static final String HOME = "home";
    public static final String CUSTOMER = "customer";
    public static final String ORDER = "order";
    public static final String PRODUCT = "product";

    public static final String ADD_CUSTOMER = "add_customer";
    public static final String EDIT_CUSTOMER = "edit_customer/{id}";
    public static final String DELETE_CUSTOMER = "delete_customer/{id}";
    public static final String VIEW_CUSTOMER = "view_customer/{id}";

    public static final String ADD_PRODUCT = "add_product";
    public static final String EDIT_PRODUCT = "edit_product/{id}";
    public static final String DELETE_PRODUCT = "delete_product/{id}";
    public static final String VIEW_PRODUCT = "view_product/{id}";

    public static final String ADD_ORDER = "add_order";
    public static final String EDIT_ORDER = "edit_order/{id}";
    public static final String DELETE_ORDER = "delete_order/{id}";
    public static final String VIEW_ORDER = "view_order/{id}";


    public static final String REDIRECT = "redirect:/";

    // -- Constructor --
    private Mappings(){

    }

}
