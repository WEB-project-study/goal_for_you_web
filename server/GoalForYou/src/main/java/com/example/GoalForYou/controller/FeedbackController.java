package com.example.GoalForYou.controller;

import com.example.GoalForYou.domain.Feedback;
import com.example.GoalForYou.domain.User;
import com.example.GoalForYou.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @PostMapping("feedback/create")
    public String feedbackCreate(User user, String title, String content) {

        feedbackService.createFeedback(user, title, content);

        return "redirect:";
    }

    @GetMapping("/feedback/read/{id}")
    public Feedback feedbackRead(Long id) {

        return feedbackService.getFeedback(id);
    }

    @PostMapping("feedback/update/{id}")
    public String feedbackUpdate(Feedback feedback,String title, String content) {

        feedbackService.updateFeedback(feedback, title, content);

        return "redirect:";
    }

    @GetMapping("/feedback/delete/{id}")
    public String feedbackDelete(Long id) {

        feedbackService.deleteFeedback(id);

        return "redirect:";
    }
}

