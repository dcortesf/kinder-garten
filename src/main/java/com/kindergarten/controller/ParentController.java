package com.kindergarten.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/kindergarten")
public class ParentController {

    private String[] parents = {"Parent1", "Parent2", "Parent3"};

    @GetMapping("/parents")
    public String[] getAllParents() {
        return parents;
    }
}