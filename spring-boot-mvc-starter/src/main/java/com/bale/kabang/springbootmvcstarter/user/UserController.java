package com.bale.kabang.springbootmvcstarter.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user/info")
    public User getUserInfo() {
        User user = new User();
        user.setId("bale");
        user.setName("kihong");
        user.setEmail("githong@kakao.com");

        return user;
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
