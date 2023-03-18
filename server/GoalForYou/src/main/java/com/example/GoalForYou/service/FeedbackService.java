package com.example.GoalForYou.service;

import com.example.GoalForYou.domain.Feedback;
import com.example.GoalForYou.domain.User;
import com.example.GoalForYou.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    public Long createFeedback(User user, String title, String content) {
        Timestamp now = new Timestamp(System.currentTimeMillis());
        Feedback feedback = new Feedback();

        feedback.setUser(user);
        feedback.setTitle(title);
        feedback.setContent(content);
        feedback.setWriteDate(now);
        feedback.setEditDate(now);

        feedbackRepository.save(feedback);
        return feedback.getFeedbackId();
    }

    public Feedback getFeedback(Long id) {
        return feedbackRepository.findById(id).get();
    }

    public List<Feedback> getFeedbackList() {
        return feedbackRepository.findAll();
    }

    public Long updateFeedback(Feedback feedback,String title, String content) {

        feedback.setTitle(title);
        feedback.setContent(content);

        return feedback.getFeedbackId();
    }

    public void deleteFeedback(Long id) {

        feedbackRepository.deleteById(id);
    }

}
