package com.example.gnet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gnet.domain.Votes;
import com.example.gnet.repository.VotesRepository;

@Service
public class VotesService {
    @Autowired
    private VotesRepository voteRepo;

    public List<Votes> selectA(){
        return voteRepo.findAll();
    }
}
