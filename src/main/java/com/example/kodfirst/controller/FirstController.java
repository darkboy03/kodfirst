package com.example.kodfirst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model){

        model.addAttribute("userName","kod");
        return "greetings"; // templates => greetings
    }

    @GetMapping("/bye")
    public String seeYou(Model model) {

        model.addAttribute("userName", "신세계");
        return "goodBye";
    }
}
