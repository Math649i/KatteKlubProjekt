package com.example.katteklubprojekt.ControllerLayer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }
}