package com.example.gnet.domain;

import java.util.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "posts")
@Data

public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "post_id")
    private Integer postid;

    // @ManyToOne()
    // @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @Column(name = "user_id")
    private String userid;

    private String body;

    // @ManyToOne()
    // @JoinColumn(name = "game_id", referencedColumnName = "id")
    @Column(name = "game_id")
    private Integer gameid;

    // @ManyToOne()
    // @JoinColumn(name = "tag_id", referencedColumnName = "id")
    @Column(name = "tag_id")
    private Integer tagid;

    @Column(name = "image_count")
    private Integer imagecount;

    // @ManyToOne()
    // @JoinColumn(name = "comment_id", referencedColumnName = "post_id")
    @Column(name = "comment_id")
    private Integer commentid;

    // @ManyToOne()
    // @JoinColumn(name = "retweet_id", referencedColumnName = "post_id")
    @Column(name = "retweet_id")
    private Integer retweetid;

    @Column(name = "creation_time")
    // @LastModifiedDate
    // @JsonFormat(pattern = "yyyy-MM-dd")
    private Date creationtime;

    // @ManyToOne()
    // @JoinColumn(name = "vote_id", referencedColumnName = "id")
    @Column(name = "vote_id")
    private Integer voteid;
    
}
