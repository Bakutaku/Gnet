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
@Table(name = "post_images")
@Data

public class Post_images {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne()
    @JoinColumn(name = "post_id", referencedColumnName = "post_id")
    private Posts postid;

    @ManyToOne()
    @JoinColumn(name = "image_id", referencedColumnName = "id")
    private Images imageid;
    

    
}
