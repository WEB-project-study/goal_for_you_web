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
    private Long feedback_id;

    private String feedback_title;

    private String feedback_content;

    private Timestamp feedback_write_date;

    private Timestamp feedback_edit_date;

    private Long user_id;


}
