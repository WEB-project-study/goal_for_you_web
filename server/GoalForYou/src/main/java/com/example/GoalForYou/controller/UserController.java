package com.example.GoalForYou.controller;

import com.example.GoalForYou.domain.User;
import com.example.GoalForYou.service.UserService;
import com.example.GoalForYou.utility.UserUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
    *
    * [register]
    * User 등록 요청
    * @return 등록된 user
    * @author 낙경
    * @version 1.0.0
    * @date 2023-03-13
    *
    **/
    @GetMapping("user/new")
    @ResponseBody
    public String register() {

        User user = UserUtility.makeRandomUser();
        String registered = userService.register(user);

        return userService.;
    }

    @GetMapping("user/delete/{email}")
    public String unregister(@PathVariable("email") String email) {

        userService.unregister(email);

        return "redirect:/";
    }

}
