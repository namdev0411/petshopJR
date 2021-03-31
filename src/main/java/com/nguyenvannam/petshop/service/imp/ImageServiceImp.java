package com.nguyenvannam.petshop.service.imp;

import com.nguyenvannam.petshop.dao.ImageDao;
import com.nguyenvannam.petshop.entity.Image;
import com.nguyenvannam.petshop.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Service
@Transactional
public class ImageServiceImp implements ImageService {
    @Value("C:/Users/nams2/OneDrive/Máy tính/petshop/src/main/resources/uploads")
    private String storePath;

    @Autowired
    ImageDao imageDao;

    @Override
    public String addImage(MultipartFile file) {
        Image image =new Image();
        String filename = UUID.randomUUID().toString();
        try{
            file.transferTo(new File(storePath+"/"+filename));
        }catch (IOException e){
            System.out.println(e);
        }
        return filename;
    }
}
