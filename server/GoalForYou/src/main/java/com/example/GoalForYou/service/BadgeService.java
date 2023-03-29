package com.example.GoalForYou.service;

import com.example.GoalForYou.domain.Badge;
import com.example.GoalForYou.repository.BadgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BadgeService {

    @Autowired
    private BadgeRepository badgeRepository;

    public Long createBadge(Long userId, String badgeName, String badgeImage) {

        Badge badge = new Badge();

        badge.setUserId(userId);
        badge.setBadgeName(badgeName);
        badge.setBadgeImage(badgeImage);

        badgeRepository.save(badge);
        return badge.getBadgeId();
    }

    public Badge getBadge(Long badgeId) {

        return badgeRepository.findById(badgeId).get();
    }

//    public List<Badge> getBadgeList(Long userId) {
//
//        return badgeRepository.findByUser_id(userId);
//    }

    public Long updateBadge(Badge badge, String badgeName, String badgeImage) {

        badge.setBadgeName(badgeName);
        badge.setBadgeImage(badgeImage);

        return badge.getBadgeId();
    }

    public void deleteBadge(Long badgeId) {

        badgeRepository.deleteById(badgeId);
    }

}
