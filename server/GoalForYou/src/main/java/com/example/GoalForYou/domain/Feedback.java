package com.example.GoalForYou.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@Data
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feedbackId;

    private String title;

    private String content;

    private Timestamp writeDate;

    private Timestamp editDate;

    public Long updateFeedback(String title, String content) {

        this.title = title;

        this.content = content;

        return this.getFeedbackId();
    }

}
