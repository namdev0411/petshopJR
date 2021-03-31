package com.nguyenvannam.petshop.controller;

import com.nguyenvannam.petshop.service.ImageService;
import com.nguyenvannam.petshop.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RequestMapping("api/image")
@RestController
public class ImageController {
    @Autowired
    ImageService imageService;

    @PostMapping("/add")
    public String addImage(@RequestPart(name = "file", required = true) MultipartFile file){
        String path = imageService.addImage(file);
        return path;
    }
}
