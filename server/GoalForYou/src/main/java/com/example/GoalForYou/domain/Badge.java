package com.example.GoalForYou.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "badge")
public class Badge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long badgeId;

    private String badgeName;

    private String badgeImage;

    private Long userId;


}
