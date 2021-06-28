package org.example.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/rest")
public class RestTestController {

    @PostMapping("/1")
    public Object t1(){
        Map<String ,Object> map= new HashMap<>();
        map.put("1","one");
        map.put("2","two");
        map.put("3","three");
        return map;
    }

    @PostMapping("/2")
    public Object t2(){
        Map<String ,Object> map= new HashMap<>();
        map.put("1","李白");
        map.put("2","杜甫");
        map.put("3","王勃");
        return map;
    }
}
