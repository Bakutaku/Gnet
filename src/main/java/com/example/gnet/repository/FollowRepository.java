package com.example.gnet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gnet.domain.Follow;
import com.example.gnet.domain.Users;

public interface FollowRepository extends JpaRepository<Follow, Integer>{
    
    List<Follow> findByTargetuserid(Users targetuserid);
    List<Follow> findBySenderuserid(Users senderuserid);

}
