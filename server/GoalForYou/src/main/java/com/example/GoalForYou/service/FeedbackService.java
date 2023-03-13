package com.example.GoalForYou.service;

import com.example.GoalForYou.domain.Feedback;
import com.example.GoalForYou.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    public Long createFeedback(Feedback feedback) {

        feedbackRepository.save(feedback);
        return feedback.getFeedbackId();
    }

    public Feedback getFeedback(Long id) {
        return feedbackRepository.findById(id).get();
    }

    public List<Feedback> getFeedbackList() {
        return feedbackRepository.findAll();
    }

}
