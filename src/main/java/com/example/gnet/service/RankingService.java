package com.example.gnet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gnet.domain.Ranking;
import com.example.gnet.repository.RankingRepository;

@Service
public class RankingService {
    @Autowired
    private RankingRepository rankingRepo;

    public List<Ranking> selectA() {
        return rankingRepo.findAll();
    }
}
