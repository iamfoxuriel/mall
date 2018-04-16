package com.rabears.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PingController {


    @RequestMapping("/ping")
    @ResponseBody
    public String ping(){
        return "It works!";
    }
}
