package com.example.GoalForYou.exception.user;

/**
 * [UserNameConflictException]
 * Runtime중 발생한 예외 중
 * 이미 동일한 이름이 존재하는 경우
 * 예외발생 및 에러코드와 함께 body 메세지 전달
 *
 * @author 낙경
 * @version 1.0.0
 * @date 2023-03-16
 ***/
public class UserNameConflictException extends RuntimeException {
    public UserNameConflictException(String name) {
        super("이미 존재하는 닉네임입니다. [ name: " + name + " ]");
    }

}
