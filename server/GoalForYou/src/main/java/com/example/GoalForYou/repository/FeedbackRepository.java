package com.example.GoalForYou.repository;

import com.example.GoalForYou.domain.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {

//    List<Feedback> findByUserId(Long userId);
}
