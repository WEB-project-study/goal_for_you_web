package com.example.GoalForYou.service;

import com.example.GoalForYou.domain.Feedback;
import com.example.GoalForYou.repository.FeedbackRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {

    private FeedbackRepository feedbackRepository;

    public Long createFeedback() {
        return null;
    }

    public Feedback getFeedback(Long id) {
        return feedbackRepository.findById(id).get();
    }

    public List<Feedback> getFeedbackList() {
        return feedbackRepository.findAll();
    }

    public Long updateFeedback() {
        return null;
    }

    public void deleteFeedback() {}
}
