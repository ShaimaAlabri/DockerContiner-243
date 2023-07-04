package com.techtribe.Deploying.our.Web.Application.as.a.jar.on.our.web.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(path = "/api/hw")
public class HelloController {
    @GetMapping
    public HashMap<String,String> getMessage(){
        HashMap<String,String> hash=new HashMap<>();
        hash.put("Message","Hello world");
        return hash;

    }

}
