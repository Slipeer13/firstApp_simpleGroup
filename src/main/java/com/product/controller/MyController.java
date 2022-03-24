package com.product.controller;

import com.product.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showView(Model model) {
        ArrayList<Product> productArrayList = new ArrayList<>();
        productArrayList.add(new Product(1, "a", 10));
        productArrayList.add(new Product(2, "b", 10));
        productArrayList.add(new Product(3, "c", 10));
        productArrayList.add(new Product(4, "d", 10));
        productArrayList.add(new Product(5, "e", 10));
        productArrayList.add(new Product(6, "f", 10));
        productArrayList.add(new Product(7, "g", 10));
        productArrayList.add(new Product(8, "h", 10));
        productArrayList.add(new Product(9, "i", 10));
        productArrayList.add(new Product(10, "j", 10));
        model.addAttribute("products", productArrayList);
        return "view";
    }
}
