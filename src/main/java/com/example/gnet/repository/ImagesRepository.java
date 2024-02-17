package com.example.gnet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gnet.domain.Images;

public interface ImagesRepository extends JpaRepository<Images, Integer>{
    
}
