package com.nguyenvannam.petshop.dao.imp;

import com.nguyenvannam.petshop.dao.PetDao;
import com.nguyenvannam.petshop.entity.Pet;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class PetDaoImp implements PetDao {

    @PersistenceContext
    EntityManager entityManager;
    @Override
    public List<Pet> getAllpets() {
        String jql = "Select p from Pet p";
        return entityManager.createQuery(jql,Pet.class).getResultList();
    }

    @Override
    public Pet getPetbyId() {
        return null;
    }
}
