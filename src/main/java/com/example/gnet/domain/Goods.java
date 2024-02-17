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
@Table(name = "goods")
@Data

public class Goods {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne()
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private Users userid;

    @ManyToOne()
    @JoinColumn(name = "post_id", referencedColumnName = "post_id")
    private Posts postid;

    

}
