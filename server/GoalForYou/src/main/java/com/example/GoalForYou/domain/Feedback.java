package com.example.GoalForYou.domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "feedback")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feedbackId;

    private String feedbackTitle;

    private String feedbackContent;

    private Timestamp feedbackWriteDate;

    private Timestamp feedbackEditDate;

    private Long userId;


}
