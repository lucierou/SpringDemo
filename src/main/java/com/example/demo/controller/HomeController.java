package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // => HomeController est un spring beans de type controller
@ResponseBody // => Retour des méthodes qui sera directement la réponse des requêtes
public class HomeController {
    // http://localhost:8000/
    // Get et Post


    @RequestMapping("/")
    public String getHome() {
        return "HelloWorld";
    }

    @RequestMapping("/toto")
    public String getToto() {
        return "Je suis la page toto";
    }

    @GetMapping("/get")
    public String pageGet() {
        return "Une page avec du GET";
    }

    @PostMapping("/post")
    public String pagePost() {
        return "Une page avec du POST";
    }
}
