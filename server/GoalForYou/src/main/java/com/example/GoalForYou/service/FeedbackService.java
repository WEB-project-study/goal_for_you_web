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

    public Long createFeedback(Long user_id, String title, String content) {
        Timestamp now = new Timestamp(System.currentTimeMillis());
        Feedback feedback = new Feedback();

        feedback.setUser_id(user_id);
        feedback.setFeedback_title(title);
        feedback.setFeedback_content(content);
        feedback.setFeedback_write_date(now);
        feedback.setFeedback_edit_date(now);

        feedbackRepository.save(feedback);
        return feedback.getFeedback_id();
    }

    public Feedback getFeedback(Long id) {
        return feedbackRepository.findById(id).get();
    }

//    public List<Feedback> getFeedbackList(Long user_id) {
//        return feedbackRepository.findByUser_id(user_id);
//    }

    public Long updateFeedback(Long id,String title, String content) {
        Timestamp now = new Timestamp(System.currentTimeMillis());
        Feedback feedback = feedbackRepository.findById(id).get();

        feedback.setFeedback_title(title);
        feedback.setFeedback_content(content);
        feedback.setFeedback_edit_date(now);
        feedbackRepository.save(feedback);

        return feedback.getFeedback_id();
    }

    public void deleteFeedback(Long id) {

        feedbackRepository.deleteById(id);
    }

}
