package com.example.gnet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gnet.domain.Genrs;
import com.example.gnet.repository.GenersRepository;

@Service
public class GenrsService {
    @Autowired
    private GenersRepository generRepo;

    public List<Genrs> selectA() {
        return generRepo.findAll();
    }

    public Genrs save(Genrs genr){
        return generRepo.save(genr);
    }
}
