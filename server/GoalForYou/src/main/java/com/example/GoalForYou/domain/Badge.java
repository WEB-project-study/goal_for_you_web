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

    public Long updateBadge(String badgeName, String badgeImage) {

        this.badgeName = badgeName;

        this.badgeImage = badgeImage;

        return this.badgeId;
    }

}
