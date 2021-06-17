package com.heraizen.gpet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/scategory")
public class ServiceCategoryController {

        @GetMapping("/")
        public String index(){
            return "Welcome to POC";
        }
}
