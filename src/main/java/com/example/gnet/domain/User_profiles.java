package com.example.gnet.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "user_profiles")
@Data

public class User_profiles {
    
    @Id
    // @ManyToOne()
    // @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    // private Users userid;
    private String user_id;

    private String comment;

    private String birth;
    
}
