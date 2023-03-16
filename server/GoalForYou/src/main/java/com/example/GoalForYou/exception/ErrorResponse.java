package com.example.GoalForYou.exception;

/**
 * Created by 낙경 on 2023-03-13.
 */
public class ErrorResponse {
    private String errorCode;
    private String errorMessage;

    public ErrorResponse(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }


}
