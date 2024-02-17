package com.example.gnet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gnet.domain.Companys;
import com.example.gnet.repository.CompanysRepository;

@Service
public class CompanysService {
    @Autowired
    private CompanysRepository companyRepo;

    public List<Companys> selectA() {
        return companyRepo.findAll();
    }
    public Companys save(Companys company){
        return companyRepo.save(company);
    }
}
