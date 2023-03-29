package com.example.GoalForYou.controller;

import com.example.GoalForYou.domain.Feedback;
import com.example.GoalForYou.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class FeedbackController {
    
    //일단은 완성했는데 주소, 반환값,타입등을 추후 수정해야함

    @Autowired
    private FeedbackService feedbackService;

    @PostMapping("/feedback/create")
    @ResponseBody
    public String feedbackCreate(@RequestParam Long userId, @RequestParam String feedbackTitle, @RequestParam String feedbackContent) {

        feedbackService.createFeedback(userId, feedbackTitle, feedbackContent);

        return "redirect:";
    }

    @GetMapping("/feedback/read/{id}")
    @ResponseBody
    public Feedback feedbackRead(@PathVariable("id") Long feedbackId) {

        return feedbackService.getFeedback(feedbackId);
    }

    @PostMapping("/feedback/update")
    @ResponseBody
    public String feedbackUpdate(@RequestParam Long feedbackId,@RequestParam String feedbackTitle, @RequestParam String feedbackContent) {

        feedbackService.updateFeedback(feedbackId, feedbackTitle, feedbackContent);


        return "redirect:";
    }

    @GetMapping("/feedback/delete/{id}")
    @ResponseBody
    public String feedbackDelete(@PathVariable("id") Long feedbackId) {

        feedbackService.deleteFeedback(feedbackId);

        return "redirect:";
    }
}

