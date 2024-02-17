package com.example.gnet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gnet.domain.Follow;
import com.example.gnet.repository.FollowRepository;

@Service
public class FollowService {
    @Autowired
    private FollowRepository followRepo;

    public List<Follow> selectA() {
        return followRepo.findAll();
    }
}

