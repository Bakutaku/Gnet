package com.example.gnet.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "game_template")
@Data

public class Gametemplate {
    
    @Id
   // @Embedded
    // @ManyToOne()
    // @JoinColumn(name = "game_id", referencedColumnName = "id")
    private int game_id;

    private String template;


}
