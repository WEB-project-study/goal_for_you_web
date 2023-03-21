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

    public Long createBadge(Long user_id, String badgeName, String badgeImage) {

        Badge badge = new Badge();

        badge.setUser_id(user_id);
        badge.setBadge_name(badgeName);
        badge.setBadge_image(badgeImage);

        badgeRepository.save(badge);
        return badge.getBadge_id();
    }

    public Badge getBadge(Long id) {

        return badgeRepository.findById(id).get();
    }

//    public List<Badge> getBadgeList(Long user_id) {
//
//        return badgeRepository.findByUser_id(user_id);
//    }

    public Long updateBadge(Badge badge, String badgeName, String badgeImage) {

        badge.setBadge_name(badgeName);
        badge.setBadge_image(badgeImage);

        return badge.getBadge_id();
    }

    public void deleteBadge(Long id) {

        badgeRepository.deleteById(id);
    }

}
