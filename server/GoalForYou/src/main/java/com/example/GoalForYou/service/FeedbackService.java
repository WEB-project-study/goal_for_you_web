package com.example.GoalForYou.service;

import com.example.GoalForYou.domain.Feedback;
import com.example.GoalForYou.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    public Long createFeedback(Long userId, String feedbackTitle, String feedbackContent) {
        Timestamp now = new Timestamp(System.currentTimeMillis());
        Feedback feedback = new Feedback();

        feedback.setUserId(userId);
        feedback.setFeedbackTitle(feedbackTitle);
        feedback.setFeedbackContent(feedbackContent);
        feedback.setFeedbackWriteDate(now);
        feedback.setFeedbackEditDate(null);

        feedbackRepository.save(feedback);
        return feedback.getFeedbackId();
    }

    public Feedback getFeedback(Long feedbackId) {
        return feedbackRepository.findById(feedbackId).get();
    }

//    public List<Feedback> getFeedbackList(Long userId) {
//        return feedbackRepository.findByUserId(userId);
//    }

    public Long updateFeedback(Long feedbackId,String feedbackTitle, String feedbackContent) {
        Timestamp now = new Timestamp(System.currentTimeMillis());
        Feedback feedback = feedbackRepository.findById(feedbackId).get();

        feedback.setFeedbackTitle(feedbackTitle);
        feedback.setFeedbackContent(feedbackContent);
        feedback.setFeedbackEditDate(now);
        feedbackRepository.save(feedback);

        return feedback.getFeedbackId();
    }

    public void deleteFeedback(Long feedbackId) {

        feedbackRepository.deleteById(feedbackId);
    }

}
