package com.example.GoalForYou.exception.user;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * [UserAlreadyExpiredException]
 * Runtime중 발생한 예외 중
 * 이미 유저가 탈퇴한 경우
 * 예외발생 및 에러코드와 함께 body 메세지 전달
 *
 * @author 낙경
 * @version 1.0.0
 * @date 2023-03-16
 ***/
public class UserAlreadyExpiredException extends RuntimeException{
    public UserAlreadyExpiredException(Date expDate) {
        super("이미 탈퇴한 회원입니다.\n[ 탈퇴일시: " + expDate.toString() + " ]");
    }
}
