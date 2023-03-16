package com.example.GoalForYou.exception.user;

/**
 *
 * [UserNotExistException]
 * Runtime중 발생한 예외 중
 * 유저가 존재하지 않는 경우
 * 예외발생 및 에러코드와 함께 body 메세지 전달
 *
 * @author 낙경
 * @version 1.0.0
 * @date 2023-03-16
 ***/
public class UserNotExistException extends RuntimeException{
    public UserNotExistException() {
        super("존재하지 않는 회원입니다.");
    }

}