package com.nguyenvannam.petshop.dao;

import com.nguyenvannam.petshop.entity.Pet;

import java.util.List;

public interface PetDao {
    public List<Pet>getAllpets ();
    public Pet getPetbyId();
}
