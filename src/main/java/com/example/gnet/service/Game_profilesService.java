package com.example.gnet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gnet.domain.Game_profiles;
import com.example.gnet.repository.Game_profilesRepository;

@Service
public class Game_profilesService {
    @Autowired
    private Game_profilesRepository gameproRepo;

    public List<Game_profiles> selectA() {
        return gameproRepo.findAll();
    }
}
