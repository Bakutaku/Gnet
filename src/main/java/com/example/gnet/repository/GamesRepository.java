package com.example.gnet.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gnet.domain.Games;






public interface GamesRepository extends JpaRepository<Games, Integer>{
    
    // List<Games> findByCompanyid(Companys companyid);

    // List<Games> findByGenreid(Geners genreid);

}
