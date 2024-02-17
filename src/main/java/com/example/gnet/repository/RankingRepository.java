package com.example.gnet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gnet.domain.Ranking;

public interface RankingRepository extends JpaRepository<Ranking, Integer>{

    //List<Ranking> findByGameid(Games gameid);
    
}
