package com.example.gnet.controller;


import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gnet.domain.Authority;
import com.example.gnet.domain.Companys;
import com.example.gnet.domain.Games;
import com.example.gnet.domain.Genrs;
import com.example.gnet.domain.Images;
import com.example.gnet.domain.Posts;
import com.example.gnet.domain.Tags;
import com.example.gnet.domain.Users;
import com.example.gnet.service.AuthorityService;
import com.example.gnet.service.GamesService;
import com.example.gnet.service.PostsService;
import com.example.gnet.service.TagsService;
import com.example.gnet.service.UsersService;

import lombok.RequiredArgsConstructor;



@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class TestController {

    private final TagsService tagsData;

    private final UsersService userData;

    private final PostsService postData;

    private final GamesService gameData;

    private final AuthorityService authorityData;

    private final PasswordEncoder passwordEncoder;

    @GetMapping("/")
    public String test() {
        return tagsData.selectA().get(0).getTitle();
    }

    @GetMapping("/a")
    public String test1() {
        Users use = new Users();

        use.setUserid("admin");
        use.setPassword("admin");
        use.setName("管理者");
        use.setEmail("test@sample.com");
        use.setIconid(new Images());
        use.getIconid().setPathid("img/icon.jpg");

        userData.save(use);

        return userData.selectA().get(0).getUserid();
    }

    @GetMapping("/p")
    public String getMethodName() {
        Posts p = postData.selectA().get(0);
        p.setBody("test 3");
        postData.save(p);

        System.out.println(p.getBody());
        System.out.println(p.getUserid());
        System.out.println(p.getImagecount());
        System.out.println(p.getGameid());
        System.out.println(p.getTagid());
        System.out.println(p.getPostid());
        System.out.println(p.getVoteid());

        return postData.selectA().get(0).getBody();
    }

    @GetMapping("/g")
    public String game() {

        Games game = new Games();
        game.setId(1);
        game.setName("ゲーム");
        game.setGenrid(new Genrs());

        game.getGenrid().setName("ジャンル");

        game.setCompanyid(new Companys());

        game.getCompanyid().setName("会社");

        gameData.save(game);


        return "OK!";
    }

    @GetMapping("/setup")
    public String setup(){

        // タグ
        Tags tag = new Tags();
        tag.setTitle("Tag");

        Tags rec = new Tags();
        rec.setId(1);
        rec.setTitle("仲間募集");

        tagsData.save(rec);
        tagsData.save(tag);

        // ゲーム
        Games game = new Games();
        game.setId(1);
        game.setName("Game");
        game.setGenrid(new Genrs());

        game.getGenrid().setName("ジャンル");

        game.setCompanyid(new Companys());

        game.getCompanyid().setName("会社");

        gameData.save(game);

        // 原神
        game.setId(2);
        game.setName("原神");
        gameData.save(game);

        game.setId(3);
        game.setName("スターレイル");
        gameData.save(game);

        game.setId(4);
        game.setName("マインクラフト");
        gameData.save(game);

        Users use = new Users();

        // 権限
        Authority admin = new Authority();
        admin.setId("admin");

        Authority user = new Authority();
        user.setId("user");

        authorityData.save(admin);
        authorityData.save(user);

        // ユーザ
        use.setUserid("admin");
        use.setPassword(passwordEncoder.encode("admin"));
        use.setName("管理者");
        use.setEmail("test@sample.com");
        use.setIconid(new Images());
        use.getIconid().setPathid("img/icon.jpg");
        use.setAuthoritygroup(new Authority());

        use.getAuthoritygroup().setId("admin");

        userData.save(use);

        return "Setup Complete";
    }
    
}

