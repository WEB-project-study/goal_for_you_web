package com.example.GoalForYou.repository;

import com.example.GoalForYou.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    /**=CREATE=====================================================**/

    /**
    *
    * [save]
    * DB에 유저 객체 저장
    * @param user: DB에 저장하려는 User 객체
    * @return User: 저장한 User가 반환됨
    * @author 낙경
    *
    **/
    User save(User user);

    /**=READ=======================================================**/

    /**
    *
    * [findByEmail]
    * email로 DB의 유저를 찾을 수 있음
    * @param email: 찾으려는 유저의 email
    * @return Optional: User가 존재할 경우 객체를 얻을 수 있음.
    * @author 낙경
    *
    **/
    Optional<User> findByEmail(String email);

    /**
    *
    * [findByUid]
    * uid로 DB의 유저를 찾을 수 있음
    * @param uid: 찾으려는 유저의 DB상 uid
    * @return Optional: User가 존재할 경우 객체를 얻을 수 있음.
    * @author 낙경
    *
    **/
    Optional<User> findByUid(Long uid);

    /**
    *
    * [findAll]
    * DB상의 모든 유저 리스트를 확인함
    * @return List: User 객체를 담은 List 반환
    * @author 낙경
    *
    **/
    List<User> findAll();

    /**
    *
    * [findByGoalTag]
    * DB상 같은 Goal의 tag를 가진 유저 리스트를 확인함
    * @return List: User 객체를 담은 List 반환
    * @author 낙경
    *
    **/
//    List<User> findByGoalTag(Goal goal);

    /**=UPDATE=====================================================**/

    /**=DELETE=====================================================**/

    /**
    *
    * [delete]
    * 해당 User와 일치하는 User 튜플 영구 삭제
    * @param user : Find..()를 통해 찾은 유저 객체
    * @author 낙경
    *
    **/
    void delete(User user);

}
