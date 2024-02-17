package com.example.gnet.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "search_history")
@Data

public class Search_history {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne()
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private Users userid;

    private String body;

    @ManyToOne()
    @JoinColumn(name = "game_id", referencedColumnName = "id")
    private Games gameid;

    @ManyToOne()
    @JoinColumn(name = "tag_id", referencedColumnName = "id")
    private Tags tagid;

    private String time;
    
}
