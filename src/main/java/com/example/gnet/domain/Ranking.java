package com.example.gnet.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "ranking")
@Data

public class Ranking {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @ManyToOne()
    @JoinColumn(name = "game_id", referencedColumnName = "id")
    private Games gameid;

    private String word;

    @Column(name = "search_count")
    private int searchcount;

    @Column(name = "post_count")
    private int postcount;

    @Column(name = "updated_at")
    private String updatedat;
}
