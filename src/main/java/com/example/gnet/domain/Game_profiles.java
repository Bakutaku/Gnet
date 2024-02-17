package com.example.gnet.domain;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "game_profiles")
@Data


public class Game_profiles {



    @EmbeddedId
    private Game_profilesId id;
    
    //@ManyToOne()
    //@JoinColumn(name = "user_id", referencedColumnName = "user_id")
    //private Users user_id;

    //@ManyToOne()
    //@JoinColumn(name = "game_id", referencedColumnName = "id")
    //private Games game_id;

    private String comment;

    private String name;
}
