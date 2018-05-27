package com.bradely.system_school.app.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testControll {
    @Value("${a}")
    private String a;

    @RequestMapping("/helloWord")
    public String helloWord(){
        System.out.println(a);
        return "HelloWord!!!";
    }
}
