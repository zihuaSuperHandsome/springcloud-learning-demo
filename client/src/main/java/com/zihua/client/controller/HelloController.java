package com.zihua.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author 刘子华
 * @Date 2020/3/13 22:24
 */
@RestController
public class HelloController {
    
    @RequestMapping("/hello")
    public String say() {
        return "Hello World!";
    }
}
