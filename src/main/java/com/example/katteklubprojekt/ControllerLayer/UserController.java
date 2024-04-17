package com.example.katteklubprojekt.ControllerLayer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/create-user")
    public String createUser() {
        // logik for at oprette en bruger
        return "redirect:/login";
    }
}