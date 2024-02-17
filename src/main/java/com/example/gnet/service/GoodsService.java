package com.example.gnet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gnet.domain.Goods;
import com.example.gnet.repository.GoodRepository;

@Service
public class GoodsService {
    @Autowired
    private GoodRepository goodRepo;

    public List<Goods> selectA() {
        return goodRepo.findAll();
    }
}
