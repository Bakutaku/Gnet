package com.example.gnet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gnet.domain.Notification_option;
import com.example.gnet.repository.Notification_optionRepository;

@Service
public class Notification_optionService {
    @Autowired
    private Notification_optionRepository notifiopRepo;

    public List<Notification_option> selectA() {
        return notifiopRepo.findAll();
    }
}
