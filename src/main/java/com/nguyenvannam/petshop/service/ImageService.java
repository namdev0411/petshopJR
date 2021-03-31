package com.nguyenvannam.petshop.service;

import org.springframework.web.multipart.MultipartFile;

public interface ImageService {
    public String addImage(MultipartFile file);
}
