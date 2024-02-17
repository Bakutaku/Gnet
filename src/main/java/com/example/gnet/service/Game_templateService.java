package com.example.gnet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gnet.domain.Gametemplate;
import com.example.gnet.repository.GametemplateRepository;

@Service
public class Game_templateService {
    @Autowired
    private GametemplateRepository gametempRepo;

    public List<Gametemplate> selectA() {
        return gametempRepo.findAll();
    }
}
