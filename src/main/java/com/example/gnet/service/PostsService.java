package com.example.gnet.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.gnet.bean.Post;
import com.example.gnet.domain.Posts;
import com.example.gnet.repository.PostsRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostsService {

    private final PostsRepository postRepo;
    private final UsersService userData;
    private final GamesService gameData;
    private final TagsService tagData;

    // public List<Posts> selectA() {
    // return postRepo.findAll();
    // }

    public String create(String userid, String mes, int gameid, int tagid) {
        Posts posts = new Posts();
        // posts.setPostid(2);
        posts.setUserid(userid);
        posts.setBody(mes);
        posts.setGameid(gameid);
        posts.setTagid(tagid);
        posts.setImagecount(0);
        // posts.setCommentid(1);
        // posts.setRetweetid(1);
        posts.setCreationtime(new Date());
        // posts.setVoteid(1);

        postRepo.save(posts);
        return "success!!";
    }

    public List<Posts> selectA() {
        return postRepo.findAll();
    }

    public List<Posts> selectGameId(int id){
        return postRepo.findByGameid(id);
    }

    public List<Post> selectAchange() {

        // 投稿一覧を取得
        List<Posts> list = this.selectA();

        // データ型変換
        List<Post> data = new ArrayList<>();

        // データ型変換
        for (Posts pos : list) {
            Post temp = new Post(pos.getPostid(),
                            userData.selectId(pos.getUserid()),
                            pos.getBody(), 
                            gameData.selectId(pos.getGameid()),
                            tagData.selectId(pos.getTagid()), 
                            pos.getCreationtime());
            data.add(temp);
        }

        return data;
    }

    public List<Post> selectAchangeGameId(int id) {

        // 投稿一覧を取得
        List<Posts> list = this.selectGameId(id);

        // データ型変換
        List<Post> data = new ArrayList<>();

        // データ型変換
        for (Posts pos : list) {
            Post temp = new Post(pos.getPostid(),
                            userData.selectId(pos.getUserid()),
                            pos.getBody(), 
                            gameData.selectId(pos.getGameid()),
                            tagData.selectId(pos.getTagid()), 
                            pos.getCreationtime());
            
            // 募集ではなければはじく
            if(temp.getTag().getId() == 1) data.add(temp);
        }

        return data;
    }

    public List<Post> selectAchangeAll() {

        // 投稿一覧を取得
        List<Posts> list = this.selectA();

        // データ型変換
        List<Post> data = new ArrayList<>();

        // データ型変換
        for (Posts pos : list) {
            Post temp = new Post(pos.getPostid(),
                            userData.selectId(pos.getUserid()),
                            pos.getBody(), 
                            gameData.selectId(pos.getGameid()),
                            tagData.selectId(pos.getTagid()), 
                            pos.getCreationtime());
            // 募集出なければはじく
            if(temp.getTag().getId() == 1) data.add(temp);
        }

        return data;
    }

    
    public List<Post> selectSearch(int tagid,int gameid) {

        // 投稿一覧を取得
        List<Posts> list = postRepo.findByTagidAndGameid(tagid, gameid);

        // データ型変換
        List<Post> data = new ArrayList<>();

        // データ型変換
        for (Posts pos : list) {
            Post temp = new Post(pos.getPostid(),
                            userData.selectId(pos.getUserid()),
                            pos.getBody(), 
                            gameData.selectId(pos.getGameid()),
                            tagData.selectId(pos.getTagid()), 
                            pos.getCreationtime());
            data.add(temp);
        }

        return data;
    }

    public void save(Posts p) {
        postRepo.save(p);
    }
}
