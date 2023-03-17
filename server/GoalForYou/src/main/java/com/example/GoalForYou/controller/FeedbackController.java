package com.example.GoalForYou.controller;

import com.example.GoalForYou.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @PostMapping()
    public String feedbackCreate() {

        return null;
    }

    @GetMapping()
    public String feedbackRead() {

        return null;
    }

    @PostMapping()
    public String feedbackUpdate() {

        return null;
    }

    @GetMapping()
    public String feedbackDelete(Long id) {

        feedbackService.deleteFeedback(id);

        return null;
    }
}

