package com.mr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lyy on 2019/10/25.
 */
@RestController
public class GitController {

    @GetMapping("/test")
    public String test(){
        return "MR 1902";
    }

}
