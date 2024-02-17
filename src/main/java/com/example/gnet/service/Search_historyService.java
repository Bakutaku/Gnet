package com.example.gnet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gnet.domain.Search_history;
import com.example.gnet.repository.Search_historyRepository;

@Service
public class Search_historyService {
    @Autowired
    private Search_historyRepository searchhisRepo;

    public List<Search_history> selectA() {
        return searchhisRepo.findAll();
    }
}
