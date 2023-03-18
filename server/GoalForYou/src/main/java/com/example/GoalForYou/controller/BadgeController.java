package com.example.GoalForYou.controller;

import com.example.GoalForYou.domain.Badge;
import com.example.GoalForYou.domain.User;
import com.example.GoalForYou.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BadgeController {

    @Autowired
    private BadgeService badgeService;


    // 뱃지수여 로직 추가 해야함!

    @GetMapping("badge/get")
    public List<Badge> badgeGet(User user) {

        return badgeService.getBadgeList(user);
    }
}
