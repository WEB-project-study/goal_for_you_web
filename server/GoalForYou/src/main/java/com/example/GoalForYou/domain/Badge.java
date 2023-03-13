package com.example.GoalForYou.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
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

    public void deleteBadge() {}
}
