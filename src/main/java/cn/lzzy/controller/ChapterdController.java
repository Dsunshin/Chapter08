package cn.lzzy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChapterdController {
    @RequestMapping(value = "/hello")
    @ResponseBody
    public String sayHello() {
        System.out.println("hello spring boot chapterd");
        return " 你好 hello spring boot!";
    }
}

