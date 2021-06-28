package org.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/1")
    //@RequestMapping注解能够处理的HTTP请求方法有： GET, HEAD, POST, PUT, PATCH, DELETE,
    //OPTIONS, TRACE 。
    public String t1(){
        //通过localhost:8081/test/1可以重定向访问到localhost:8081/home.html
        return "forward:/home.html";//转发到某个路径
        //return "redirect:/home.html";//重定向到某个路径
    }
}
