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
@Table(name = "games")
@Data
public class Games {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    @ManyToOne()
    @JoinColumn(name = "genre_id", referencedColumnName = "id")
    private Genrs genrid;

    @ManyToOne()
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private Companys companyid;

}
