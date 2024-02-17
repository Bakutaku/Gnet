package com.example.gnet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gnet.domain.Tags;

public interface TagsRepository extends JpaRepository<Tags,Integer> {
    
}
