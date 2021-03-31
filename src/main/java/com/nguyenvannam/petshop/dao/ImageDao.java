package com.nguyenvannam.petshop.dao;

import com.nguyenvannam.petshop.entity.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ImageDao {
    public List<Image> getAllImages();
    public String addImage(String path);
}
