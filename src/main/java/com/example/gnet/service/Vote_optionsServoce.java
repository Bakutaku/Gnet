package com.example.gnet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gnet.domain.Vote_options;
import com.example.gnet.repository.Vote_optionsRepository;

@Service
public class Vote_optionsServoce {
    @Autowired
    private Vote_optionsRepository voteopRepo;

    public List<Vote_options> selectA() {
        return voteopRepo.findAll();
    }
}
