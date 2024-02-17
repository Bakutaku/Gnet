package com.example.gnet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gnet.domain.User_profiles;
import com.example.gnet.repository.User_profilesRepository;

@Service
public class User_profilesService {
    @Autowired
    private User_profilesRepository user_profilesRepo;

    public List<User_profiles> selectA(){
        return user_profilesRepo.findAll();
        
        
    }
}
