package com.example.GoalForYou.repository;

//import com.example.GoalForYou.community.domain.Community;
import com.example.GoalForYou.domain.Community;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommunityRepository extends JpaRepository<Community, Long> {
    // 검색 메서드, 보류
<<<<<<< Updated upstream
    List<Community> findByTitleContaining(String keyword);
=======
//    List<Community> findByTitleContaining(String keyword);
>>>>>>> Stashed changes
}
