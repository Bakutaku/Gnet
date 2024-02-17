package com.example.gnet.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gnet.domain.Gametemplate;


public interface GametemplateRepository extends JpaRepository<Gametemplate, Integer>{

    // List<Gametemplate> findByGameid(Games gameid);
    
}
