package com.example.gnet.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gnet.domain.Users;

public interface UsersRepository extends JpaRepository<Users, String>{

    // List<Users> findByAuthoritygroup(Authority authoritygroup);
    // List<Users> findByIconid(Images iconid);
    // List<Users> findByHeaderid(Images headerid);
    
    
}
