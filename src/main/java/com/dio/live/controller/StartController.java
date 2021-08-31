package com.dio.live.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Getter @Setter
public class StartController {

    @Value("${app.message}")
    private String startMessage;

    @GetMapping
    public String getStartMessage(){
        return startMessage;
    }
}
