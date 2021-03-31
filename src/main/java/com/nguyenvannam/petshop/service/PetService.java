package com.nguyenvannam.petshop.service;

import com.nguyenvannam.petshop.entity.Pet;

import java.util.List;

public interface PetService {
    public List<Pet> getAllPets();
    public Pet getPetbyId();
}
