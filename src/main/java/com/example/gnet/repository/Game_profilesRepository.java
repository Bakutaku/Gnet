package com.example.gnet.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gnet.domain.Game_profiles;
import com.example.gnet.domain.Game_profilesId;


public interface Game_profilesRepository extends JpaRepository<Game_profiles, Game_profilesId>{
    
    // List<Game_profiles> findByUserid(Users userid);
    // List<Game_profiles> findByGameid(Games gameid);

}
