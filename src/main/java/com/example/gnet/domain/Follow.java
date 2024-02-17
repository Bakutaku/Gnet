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
@Table(name = "follow")
@Data

public class Follow {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int id;

    @ManyToOne()
    @JoinColumn(name = "target_user_id", referencedColumnName = "user_id")
    private Users targetuserid;

    @ManyToOne()
    @JoinColumn(name = "sender_user_id", referencedColumnName = "user_id")
    private Users senderuserid;

    
    
}
