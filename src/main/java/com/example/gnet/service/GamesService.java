package com.example.gnet.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.example.gnet.domain.Games;
import com.example.gnet.repository.GamesRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GamesService {
    private final GamesRepository gamesrepo;
    private final CompanysService companysData;
    private final GenrsService genrsData;


    public List<Games> selectA() {
        return gamesrepo.findAll();
    }

    public Games selectId(int id){
        return gamesrepo.findById(id).get();
    }

    public void save(Games game){

        game.setCompanyid(companysData.save(game.getCompanyid()));
        game.setGenrid(genrsData.save(game.getGenrid()));
        gamesrepo.save(game);
    }
}
