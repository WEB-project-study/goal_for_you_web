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

    private User user;

    private String title;

    private String content;

    private Timestamp writeDate;

    private Timestamp editDate;


}
