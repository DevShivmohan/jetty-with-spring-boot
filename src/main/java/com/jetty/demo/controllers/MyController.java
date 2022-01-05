package com.jetty.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/jetty")
public class MyController {

    @RequestMapping(value = "/msg",method = RequestMethod.GET)
    @ResponseBody
    public String show(){
        return "Welcome in Spring boot with jetty server";
    }
}
