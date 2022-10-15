package com.nestdigital.studentApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {


    @GetMapping("")
    public String home()
    {
        return "HOME PAGE";
    }

    @GetMapping("/view")
    public  String view()
    {
        return "VIEW PAGE";
    }
}
