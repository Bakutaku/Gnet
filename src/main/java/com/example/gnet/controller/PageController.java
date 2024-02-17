package com.example.gnet.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.gnet.bean.Post;
import com.example.gnet.domain.Games;
import com.example.gnet.domain.Tags;
import com.example.gnet.domain.UserGameList;
import com.example.gnet.domain.Users;
import com.example.gnet.service.GamesService;
import com.example.gnet.service.PostsService;
import com.example.gnet.service.TagsService;
import com.example.gnet.service.UserGameListService;
import com.example.gnet.service.UsersService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/gnet")
public class PageController {

    private final TagsService tagsData;

    private final UsersService userData;

    private final PostsService postData;

    private final GamesService gameData;

    private final UserGameListService userGameListData;

    /**
     * 全画面で必要なデータを格納する
     * 
     * @param mav
     */
    private void setData(ModelAndView mav) {

        // ユーザデータ取得
        Users user = userData.selectId(getUsername());

        // ゲーム一覧取得
        List<Games> games = gameData.selectA();

        // タグ一覧取得
        List<Tags> tags = tagsData.selectA();

        // ユーザデータ設定
        mav.addObject("gameList", games);
        mav.addObject("tagList", tags);
        mav.addObject("user", user);
    }

    /**
     * ユーザ名を取得する
     * 
     * @return ユーザ名
     */
    public String getUsername() {
        // SecurityContextHolderから
        // org.springframework.security.core.Authenticationオブジェクトを取得
        Authentication authentication = SecurityContextHolder.getContext()
                .getAuthentication();
        if (authentication != null) {
            // AuthenticationオブジェクトからUserDetailsオブジェクトを取得
            Object principal = authentication.getPrincipal();
            if (principal instanceof UserDetails) {
                // UserDetailsオブジェクトから、ユーザ名を取得
                return ((UserDetails) principal).getUsername();
            }
        }
        return null;
    }

    /**
     * 投稿画面
     */
    @GetMapping("/post")
    public ModelAndView post(ModelAndView mav, @RequestParam(defaultValue = "test") String mes, Model mo) {
        // データを登録する
        this.setData(mav);

        // 表示する画面を指定
        mav.setViewName("posts");
        return mav;
    }

    /**
     * 投稿
     */
    @PostMapping("/pos")
    public ModelAndView postRequest(ModelAndView mav, @RequestParam("mes") String mes,@RequestParam("game") int game,@RequestParam("tag") int tag, Model model) {

        // データベースに入力
        postData.create(this.getUsername(), mes, game, tag);

        // データを登録する
        this.setData(mav);

        // 表示する画面を指定
        mav.setViewName("posts");
        return mav;
    }

    @GetMapping("/home")
    public ModelAndView home(ModelAndView mav, @RequestParam(defaultValue = "test") String mes, Model mo) {

        // データを登録する
        this.setData(mav);
        mav.addObject("posts", postData.selectAchange());

        // 表示する画面を指定する
        mav.setViewName("home");
        return mav;
    }

    @GetMapping("/search")
    public ModelAndView search(ModelAndView mav, @RequestParam(defaultValue = "test") String mes, Model mo) {

        // データを登録する
        this.setData(mav);

        // 表示する画面を指定
        mav.setViewName("search");
        return mav;
    }

    @GetMapping("/searchRequest")
    public ModelAndView search(ModelAndView mav,@RequestParam(defaultValue="none") String message,@RequestParam("tag") int tag,@RequestParam("game[]") List<Integer> games, Model mo){

        System.out.println(message);

        this.setData(mav);

        // 検索結果一時保存用
        List<Post> postList = new ArrayList<>();

        // 検索
        for(int i : games){
            postList.addAll(postData.selectSearch(tag, i));
            System.out.println("検索条件tag:"+ tag);
            System.out.println("検索条件game:"+i);
        }
        
        System.out.println(postList.size()+"検索数");

        mav.addObject("posts", postList);

        mav.setViewName("searchResponse");
        return mav;
    }

    @GetMapping("/recruitmment")
    public ModelAndView recruitmment(ModelAndView mav, Model mo) {

        // ゲーム別の投稿格納用
        Map<String,List<Post>> posts = new HashMap<>();
        
        posts.put("All", postData.selectAchangeAll());

        // ユーザ取得
        Users user = userData.selectId(getUsername());

        // 登録しているゲームを取得
        List<UserGameList> gamelist = userGameListData.selectUser(user);

        for(UserGameList list : gamelist){
            posts.put(list.getGame().getName(),postData.selectAchangeGameId(list.getGame().getId()));
        }


        // データを登録する
        this.setData(mav);
        mav.addObject("mapPost", posts);

        // 表示する画面を指定
        mav.setViewName("recruitmment");
        return mav;
    }

    @GetMapping("/user_config")
    public ModelAndView user_config(ModelAndView mav, @RequestParam(defaultValue = "test") String mes, Model mo) {

        // データを登録する
        this.setData(mav);

        // 表示する画面を指定
        mav.setViewName("user_config");
        return mav;
    }

    @GetMapping("/profile")
    public ModelAndView profile(ModelAndView mav, @RequestParam(defaultValue = "test") String mes, Model mo) {

        // データを登録する
        this.setData(mav);

        // 表示する画面を指定
        mav.setViewName("profile");
        return mav;
    }

    @GetMapping("/trend")
    public ModelAndView trend(ModelAndView mav, @RequestParam(defaultValue = "test") String mes, Model mo) {
        // データを登録する
        this.setData(mav);

        // 表示する画面を指定
        mav.setViewName("trend");
        return mav;
    }

    @GetMapping("/user_config_tuuti")
    public ModelAndView user_config_tuuti(ModelAndView mav, @RequestParam(defaultValue = "test") String mes, Model mo) {
        // データを登録する
        this.setData(mav);

        // 表示する画面を指定
        mav.setViewName("user_config_tuuti");
        return mav;
    }

    @GetMapping("/user_config_profile")
    public ModelAndView user_config_profile(ModelAndView mav, @RequestParam(defaultValue = "test") String mes, Model mo) {
        // データを登録する
        this.setData(mav);

        // 表示する画面を指定
        mav.setViewName("user_config_profile");
        return mav;
    }

    @GetMapping("/user_config_game")
    public ModelAndView user_config_game(ModelAndView mav, @RequestParam(defaultValue = "test") String mes, Model mo) {
        // データを登録する
        this.setData(mav);

        // 表示する画面を指定
        mav.setViewName("user_config_game");
        return mav;
    }

    @GetMapping("/addGame")
    public ModelAndView addGame(ModelAndView mav, @RequestParam int game, Model mo) {

        // 取得
        Users user = userData.selectId(getUsername());
        Games games = gameData.selectId(game);

        // 保存
        userGameListData.save(user, games);

         // ゲーム別の投稿格納用
        Map<String,List<Post>> posts = new HashMap<>();
        
        posts.put("All", postData.selectAchangeAll());

        // 登録しているゲームを取得
        List<UserGameList> gamelist = userGameListData.selectUser(user);

        for(UserGameList list : gamelist){
            posts.put(list.getGame().getName(),postData.selectAchangeGameId(list.getGame().getId()));
        }

        // データを登録する
        this.setData(mav);
        mav.addObject("mapPost", posts);

        // 表示する画面を指定
        mav.setViewName("recruitmment");
        return mav;
    }
}
