package com.example.GoalForYou.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "badge")
public class Badge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long badge_id;

    private String badge_name;

    private String badge_image;

    private Long user_id;


}
