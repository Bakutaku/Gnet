package com.example.gnet.domain;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class Users {
    
    @Id
    @Column(name = "user_id")
    private String userid;

    private String email;

    private String name;

    private String password;

    @ManyToOne()
    @JoinColumn(name = "icon_id", referencedColumnName = "id")
    private Images iconid;

    @ManyToOne()
    @JoinColumn(name = "header_id", referencedColumnName = "id")
    private Images headerid;

    private int gender;

    @ManyToOne()
    @JoinColumn(name = "authority_group", referencedColumnName = "id")
    private Authority authoritygroup;

    @Column(name = "creation_time")
    private Date creationtime;

    @Column(name = "last_login_time")
    private Date lastlogintime;

}
