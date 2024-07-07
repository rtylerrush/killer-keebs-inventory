package com.example.demo.controllers;

import com.example.demo.domain.Product;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class BuyProductController {
    @Autowired
    private ProductRepository productRepository;


    @GetMapping("/buyProduct")
    public String buyProduct(@RequestParam("productID") long product){
        Optional<Product> myProduct = productRepository.findById(product);
        if(myProduct.isPresent()){
            Product purchasedProduct = productRepository.findById(product).get();

            if(purchasedProduct.getInv() > 0) {
                purchasedProduct.setInv(purchasedProduct.getInv() - 1);
                productRepository.save(purchasedProduct);
                return "buysuccessful";
            }
        }
        return "buyunsuccessful";
    }
}
