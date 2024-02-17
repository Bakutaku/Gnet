package com.example.gnet.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.gnet.domain.Games;
import com.example.gnet.domain.UserGameList;
import com.example.gnet.domain.Users;
import com.example.gnet.repository.UserGameListRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserGameListService {
  private final UserGameListRepository gamelistRep;

  public List<UserGameList> selectA(){
    return gamelistRep.findAll();
  }

  public UserGameList selectId(int id){
    return gamelistRep.findById(id).get();
  }

  public List<UserGameList> selectUser(Users user){
    return gamelistRep.findByUser(user);
  }

  public void save(Users user,Games game){
    UserGameList gamelist = new UserGameList();
    gamelist.setUser(user);
    gamelist.setGame(game);

    gamelistRep.save(gamelist);
  }
}
