package com.example.gnet.bean;


import java.util.Date;

import com.example.gnet.domain.Games;
import com.example.gnet.domain.Tags;
import com.example.gnet.domain.Users;

import lombok.Data;

@Data
public class Post {

    private int id; // 投稿ID
    private Users user; // 投稿者
    private String body;    // 内容
    private Games game; // ゲームの種類
    private Tags tag;   // タグ
    private Date creationTime;  // 投稿日


    public Post(int id, Users user, String body, Games game, Tags tag, Date date) {
        this.id = id;
        this.user = user;
        this.body = body;
        this.game = game;
        this.tag = tag;
        this.creationTime = date;
    }
}
