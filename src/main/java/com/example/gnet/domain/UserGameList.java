package com.example.gnet.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "userGame")
@Data
public class UserGameList {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @ManyToOne()
  @JoinColumn(name = "user", referencedColumnName = "user_id")
  private Users user;

  @ManyToOne()
    @JoinColumn(name = "game", referencedColumnName = "id")
  private Games game;
}
