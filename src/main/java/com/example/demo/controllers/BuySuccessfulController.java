package com.example.demo.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BuySuccessfulController {
    @GetMapping("/buysuccessful")
    public String buySuccessful(){
        return "successful";
    }
}