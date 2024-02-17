package com.example.gnet.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import com.example.gnet.domain.Search_history;

public interface Search_historyRepository extends JpaRepository<Search_history, Integer>{

    // List<Search_history> findByUserid(String userid);
    // List<Search_history> findByGameid(Games gameid);
    // List<Search_history> findByTagid(Tags tagid);
    
}
