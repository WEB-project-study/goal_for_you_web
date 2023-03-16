package com.example.GoalForYou.exception.user;

import com.example.GoalForYou.exception.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * [UserExceptionHandler]
 * User Repository를 관리하며 발생하는 예외를 처리
 *
 * @author 낙경
 * @version 1.0.0
 * @date 2023-03-13
 ***/
@ControllerAdvice
public class UserExceptionHandler {

    /**
     *
     * [userAlreadyExist]
     * 이미 유저가 존재할 경우 충돌발생알림
     * 전달될 Http응답
     *
     * @param exception
     * @return HTTP 409 CONFLICT
     * @author 낙경
     * @version 1.0.0
     * @date 2023-03-16
     *
    **/
    @ExceptionHandler(UserAlreadyExistException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ResponseEntity<ErrorResponse> userAlreadyExist(UserAlreadyExistException exception) {
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.CONFLICT.toString(), exception.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.CONFLICT);
    }

    /**
     *
     * [userNameExist]
     * 이미 동일한 닉네임의 유저가 존재할 경우 충돌발생알림
     * 전달될 Http응답
     * @param exception
     * @return HTTP 409 CONFLICT
     * @author 낙경
     * @version 1.0.0
     * @date 2023-03-16
     *
    **/
    @ExceptionHandler(UserNameConflictException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ResponseEntity<ErrorResponse> userNameExist(UserNameConflictException exception) {
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.CONFLICT.toString(), exception.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.CONFLICT);
    }

    /**
     *
     * [userAlreadyExpired]
     * 이미 유저가 탈퇴한 회원으로 확인될 경우
     * 중복요청 충돌 발생알림
     * 전달될 Http응답
     * @param exception
     * @return HTTP 409 CONFLICT
     * @author 낙경
     * @version 1.0.0
     * @date 2023-03-16
     *
    **/
    @ExceptionHandler(UserAlreadyExpiredException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ResponseEntity<ErrorResponse> userAlreadyExpired(UserAlreadyExpiredException exception) {
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.CONFLICT.toString(), exception.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.CONFLICT);
    }

    /**
     *
     * [userNotExist]
     * 존재하지 않는 유저로 확인될 경우
     * 중복요청 충돌 발생알림
     * 전달될 Http응답
     * @param exception
     * @return Http 404 NOT_FOUND
     * @author 낙경
     * @version 1.0.0
     * @date 2023-03-17
     *
    **/
    @ExceptionHandler(UserNotExistException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ErrorResponse> userNotExist(UserNotExistException exception) {
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.CONFLICT.toString(), exception.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.CONFLICT);
    }

}

