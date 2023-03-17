package com.example.GoalForYou.controller;

import com.example.GoalForYou.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BadgeController {

    @Autowired
    private BadgeService badgeService;
}
