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

    public Long createBadge(Badge badge) {

        badgeRepository.save(badge);
        return badge.getBadgeId();
    }

    public Badge getBadge(Long id) {

        return badgeRepository.findById(id).get();
    }

    public List<Badge> getBadgeList() {

        return badgeRepository.findAll();
    }

}
