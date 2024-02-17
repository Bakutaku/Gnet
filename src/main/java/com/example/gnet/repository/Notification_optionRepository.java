package com.example.gnet.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gnet.domain.Notification_option;

public interface Notification_optionRepository extends JpaRepository<Notification_option, String>{

    //List<Notification_option> findByUserid(Users userid);
    
}
