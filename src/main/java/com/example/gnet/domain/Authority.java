package com.example.gnet.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "authority")
@Data

public class Authority {
    
    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "user_create")
    private boolean usercreate;

    @Column(name = "user_delete")
    private boolean userdelete;

    @Column(name = "user_edit")
    private boolean useredit;

    @Column(name = "user_ban")
    private boolean userban;

    @Column(name = "other_user_edit")
    private boolean otheruseredit;

    @Column(name = "other_user_delete")
    private boolean otheruserdelete;

    @Column(name = "post")
    private boolean post;

    @Column(name = "post_edit")
    private boolean postedit;

    @Column(name = "post_delete")
    private boolean postdelete;

    @Column(name = "other_post_edit")
    private boolean otherpostedit;

    @Column(name = "other_post_delete")
    private boolean otherpostdelete;

    @Column(name = "post_see")
    private boolean postsee;

    private boolean good;

    private boolean retweet;
    
}
