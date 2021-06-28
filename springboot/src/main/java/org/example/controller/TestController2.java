package org.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
@Controller//表示为web控制器，处理web请求响应
@RequestMapping("/test2")
//@RequestMapping：定义在类、方法上，配置url，请求方法等。
//提供的服务路径为：类和方法的路径拼接，类上可以没有，方法上有该注释，也叫请求映射方法
public class TestController2 {

//    @RequestMapping("/2")
//    @ResponseBody
//    public String t1(){
//
//    }

    @RequestMapping("/2")
    @ResponseBody
    public String t2(){
        return "真相只有一个";
    }

    @RequestMapping("/3")
    @ResponseBody
    //定义在类和方法上，表示方法返回值作为响应体内容
    //一般是返回自定义类型的对象，会序列化为json字符串
    public Object t3(){
        Map<String,Object> map = new HashMap<>();
        map.put("1","1");
        map.put("2","false");
        map.put("3","拜拜");
        return map;
    }

    @RequestMapping("/7")
    public ResponseEntity test7(){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "张三");
        map.put(2, "李四");
        map.put(3, "王五");
        return ResponseEntity.status(200).body(map);
    }
}
