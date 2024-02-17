package com.example.gnet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gnet.domain.UserGameList;
import com.example.gnet.domain.Users;

import java.util.List;


public interface UserGameListRepository extends JpaRepository<UserGameList,Integer>{
  public List<UserGameList> findByUser(Users user);
}
