package com.rensquare.finance.BillingSoftware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import com.rensquare.finance.BillingSoftware.entity.Product;
import com.rensquare.finance.BillingSoftware.repository.ProductRepository;
import com.rensquare.finance.BillingSoftware.service.ProductService;


@RequestMapping("/product")
@Controller
public class ProductController {

	@Autowired
    ProductService productService;
	
	@Autowired
	ProductRepository productRepo;


    @GetMapping("/products")
    public  String products(Model model) {
        Iterable<Product> productList = productService.getAllProducts();
        model.addAttribute("products", productList);
        return "products";
    }
    
   
    @PostMapping("/addProduct")
    public Product addMember(@RequestBody Product product) {
        return productService.addProduct(product);
    }
      
}