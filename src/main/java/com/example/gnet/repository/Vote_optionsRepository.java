package com.example.gnet.repository;



import org.springframework.data.jpa.repository.JpaRepository;


import com.example.gnet.domain.Vote_options;

public interface Vote_optionsRepository extends JpaRepository<Vote_options, Integer>{

    //List<Vote_options> findByPostid(Posts postid);
    
}
