package com.example.gnet.repository;



import org.springframework.data.jpa.repository.JpaRepository;


import com.example.gnet.domain.Votes;

public interface VotesRepository extends JpaRepository<Votes, Integer>{

    //List<Votes> findByVoteoptions(Vote_options voteoptions);
    
}
