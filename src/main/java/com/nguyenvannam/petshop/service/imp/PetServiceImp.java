package com.nguyenvannam.petshop.service.imp;

import com.nguyenvannam.petshop.dao.PetDao;
import com.nguyenvannam.petshop.entity.Pet;
import com.nguyenvannam.petshop.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PetServiceImp implements PetService {
    @Autowired
    private PetDao petDao;

    @Override
    public List<Pet> getAllPets() {
        return petDao.getAllpets();
    }

    @Override
    public Pet getPetbyId() {
        return petDao.getPetbyId();
    }
}
