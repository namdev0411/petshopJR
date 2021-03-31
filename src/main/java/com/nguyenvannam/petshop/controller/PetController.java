package com.nguyenvannam.petshop.controller;

import com.nguyenvannam.petshop.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class PetController {

    @Autowired
    PetService petService;

    @GetMapping("/allpets")
    public ResponseEntity getAllPets(){
        return ResponseEntity.ok(petService.getAllPets());
    }
    public ResponseEntity getPetById(){
        return ResponseEntity.ok(petService.getPetbyId());
    }
}
