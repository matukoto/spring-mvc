package com.example.mvccontroller.controller;

import com.example.mvccontroller.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/form")
    private String readForm(@ModelAttribute User user) {
        return "form";
    }

    @PostMapping("/form")
    private String confirm(@ModelAttribute User user) {

        /* @ModelAttriubute リクエストと一致するものがモデルへ流しこまれる（データバインディング）
           本来ならここで model.addAttribute("user", user); としてモデルに登録する必要がある
         */
        return "confirm";
    }

}
