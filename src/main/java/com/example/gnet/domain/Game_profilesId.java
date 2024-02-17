package com.example.gnet.domain;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Embeddable
@Data

public class Game_profilesId implements Serializable{
    
    //private String user_id;
    //private int game_id;

        @ManyToOne()
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private Users userid;

    @ManyToOne()
    @JoinColumn(name = "game_id", referencedColumnName = "id")
    private Games gameid;

}
