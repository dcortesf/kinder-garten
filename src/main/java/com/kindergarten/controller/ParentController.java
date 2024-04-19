package com.kindergarten.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/kindergarten")
public class ParentController {

    private String[] parents = {"Fulanito", "Zetanito", "Berenganito"};

    @GetMapping("/parents")
    public String[] getAllParents() {
        return parents;
    }
}