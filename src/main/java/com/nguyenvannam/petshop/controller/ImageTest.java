package com.nguyenvannam.petshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/image")
@Controller
public class ImageTest {
    @GetMapping("/")
    public String add(){
        return "index";
    }
}
