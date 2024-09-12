package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Message;
import com.example.demo.repository.MessageRepository;

@RestController
public class Controller {

    @Autowired
    private MessageRepository messageRepository;
    
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @PostMapping("/hello")
    public Message saveMessage(@RequestBody Message message) {
        return messageRepository.save(message);
    }
}
