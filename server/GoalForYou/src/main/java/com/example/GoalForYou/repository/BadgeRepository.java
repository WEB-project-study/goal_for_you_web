package com.example.GoalForYou.repository;

import com.example.GoalForYou.domain.Badge;
import com.example.GoalForYou.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BadgeRepository extends JpaRepository<Badge, Long> {
    List<Badge> findByUser(User user);
}
