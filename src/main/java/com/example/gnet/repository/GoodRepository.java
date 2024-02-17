package com.example.gnet.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gnet.domain.Goods;

public interface GoodRepository extends JpaRepository<Goods, Integer>{

    // List<Goods> findByUserid(Users userid);
    // List<Goods> findByPostid(Posts postid);
    
    
}
