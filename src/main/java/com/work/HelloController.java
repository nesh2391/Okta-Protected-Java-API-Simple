package com.work;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/abc")
    public String getHi() {
        System.out.println("End Point hit");
        return "Hi";
    }
}