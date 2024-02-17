package com.example.gnet.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gnet.domain.Tags;
import com.example.gnet.repository.TagsRepository;

@Service
public class TagsService {
    @Autowired
    private TagsRepository tagsRepo;

    public List<Tags> selectA(){
        return tagsRepo.findAll();
    }
    
    public Tags selectId(int id){
        return tagsRepo.findById(id).get();
    }

    public Tags save(Tags tag){
        return tagsRepo.save(tag);
    }
}

