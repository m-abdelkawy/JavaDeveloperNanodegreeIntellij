package com.example.springboothelloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/*@Controller
public class Hellocontroller {
    private Map<String, Object> result = new HashMap<>();

    @RequestMapping("/hello")
    @ResponseBody
    public Map<String, Object> hello(){
        result.put("name", "Ahmed");
        result.put("city", "Cairo");

        return result;

    }*/

@RestController
public class Hellocontroller {
    private Map<String, Object> result = new HashMap<>();

    @RequestMapping("/hello")

    public Map<String, Object> hello(){
        result.put("name", "Ahmed");
        result.put("city", "Cairo");

        return result;

    }
}
