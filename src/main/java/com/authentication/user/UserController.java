package com.authentication.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/")
    public String index(){
        return  "index";
    }
    @GetMapping("/register")
    public String register(){
        return  "signup";
    }
}
