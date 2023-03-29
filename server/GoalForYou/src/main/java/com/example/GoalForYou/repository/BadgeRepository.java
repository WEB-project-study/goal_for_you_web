package com.example.GoalForYou.repository;

import com.example.GoalForYou.domain.Badge;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BadgeRepository extends JpaRepository<Badge, Long> {

//    List<Badge> findByUser_id(Long userId);
}
