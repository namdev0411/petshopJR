package com.nguyenvannam.petshop.dao.imp;

import com.nguyenvannam.petshop.dao.ImageDao;
import com.nguyenvannam.petshop.entity.Image;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class ImageDaoImp implements ImageDao {

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public List<Image> getAllImages() {
        String jql = "select i from Image i";
        return entityManager.createQuery(jql,Image.class).getResultList();
    }

    @Override
    public String addImage(String path) {
        Image image = new Image();
        image.setId(path);
        entityManager.merge(image);
        return path;
    }
}
