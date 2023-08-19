package com.luoxi.basic.user.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author tangdou
 * @version 1.0
 * @Date 2023/8/19 19:30
 */
@RestController
public class IndexController {

    @Value(("${spring.application.name:default}"))
    private String applicationName;

    @GetMapping("index")
    public String index(){
        return applicationName + LocalDateTime.now();
    }

}
