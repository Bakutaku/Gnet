package com.example.gnet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gnet.domain.Images;
import com.example.gnet.repository.ImagesRepository;

@Service
public class ImagesService {
    @Autowired
    private ImagesRepository imagesRepo;

    public List<Images> selectA() {
        return imagesRepo.findAll();
    }
}
