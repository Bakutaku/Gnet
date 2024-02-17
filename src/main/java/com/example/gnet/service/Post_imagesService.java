package com.example.gnet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gnet.domain.Post_images;
import com.example.gnet.repository.Post_imagesRepository;

@Service
public class Post_imagesService {
    @Autowired
    private Post_imagesRepository postimageRepo;

    public List<Post_images> selectA() {
        return postimageRepo.findAll();
    }
}
