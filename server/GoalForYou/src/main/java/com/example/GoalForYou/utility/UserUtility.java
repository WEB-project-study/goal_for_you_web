package com.example.GoalForYou.utility;

import com.example.GoalForYou.domain.User;

import java.util.Random;

/**
 * Created by 낙경 on 2023-03-13.
 */
public class UserUtility {

    /**
    *
    * [makeRandomUser]
    * name과 email이 랜덤으로 지정된 User객체 생성
    * @return User: uid, regDate, expDate는 설정되지 않음
    * @author 낙경
    * @version 1.0.0
    * @date 2023-03-13
    *
    **/
    public static User makeRandomUser(){
        String name = randomString();
        String email = randomString()+"@"+randomString()+".com";

        User user = new User();
        user.setName(name);
        user.setEmail(email);

        return user;
    }

    /**
    *
    * [randomString]
    * length 길이의 임의의 문자열 생성 함수
    * @param length: 문자열 길이
    * @return String: length길이로 생성된 임의의 문자열
    * @author 낙경
    * @version 1.0.0
    * @date 2023-03-13
    *
    **/
    private static String randomString(int length){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = length;
        Random random = new Random();
        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedString;
    }

    private static String randomString(){
        return randomString(10);
    }


}
