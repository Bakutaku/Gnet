package com.example.gnet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gnet.domain.Authority;
import com.example.gnet.repository.AuthorityRepository;

@Service
public class AuthorityService {
    @Autowired
    private AuthorityRepository authRepo;

    public List<Authority> selectA() {
        return authRepo.findAll();
    }

    public Authority save(Authority authority){
        return authRepo.save(authority);
    }
}
