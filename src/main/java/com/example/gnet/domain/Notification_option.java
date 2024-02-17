package com.example.gnet.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "notification_option")
@Data

public class Notification_option {

    @Id
    // @ManyToOne()
    // @JoinColumn(name = "user_id",referencedColumnName = "user_id")
    private String user_id;
    
    private int follow;

    private int retweet;

    private int news;

    private int comment;



    
}
