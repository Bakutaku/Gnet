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
@Table(name = "votes")
@Data

public class Votes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String title;

    @Column(name = "creation_time")
    private String creationtime;

    @ManyToOne()
    @JoinColumn(name = "vote_options", referencedColumnName = "id")
    private Vote_options voteoptions;
    
}
