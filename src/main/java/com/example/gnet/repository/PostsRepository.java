package com.example.gnet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gnet.domain.Posts;

public interface PostsRepository extends JpaRepository<Posts, Integer>{

    // List<Posts> findByUserid(Users userid);
    public List<Posts> findByGameid(int gameid);
    // List<Posts> findByTagid(Tags tagid);
    // List<Posts> findByCommentid(Posts commentid);
    // List<Posts> findByRetweetid(Posts retweetid);
    // List<Posts> findByVoteid(Votes voteid);
    public List<Posts> findByTagidAndGameid(int tagid,int gameid);
    
    
}
