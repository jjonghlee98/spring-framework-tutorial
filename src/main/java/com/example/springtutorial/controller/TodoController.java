package com.example.springtutorial.controller;

import com.example.springtutorial.dto.TodoDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/todo")
@Log4j2
public class TodoController {

    @RequestMapping("/list")
    public void list() {
        log.info("todo list.....");
    }

    @GetMapping("/register")
    public void registerGET() {
        log.info("GET todo register....");
    }

    @PostMapping("/register")
    public void registerPOST(TodoDTO todoDTO) {
        log.info("POST todo register....");
        log.info(todoDTO);
    }

}
