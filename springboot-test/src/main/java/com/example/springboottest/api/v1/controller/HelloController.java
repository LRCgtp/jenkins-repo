package com.example.springboottest.api.v1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ruicai.li@hand-china.com
 */
@RestController("/v1/orginazation_id/hello")
public class HelloController {

    @GetMapping("/{orginazation_id}")
    public String getStr(@PathVariable(value = "orginazation_id")Long orginazationId){
        return "我是组织ID为+"+orginazationId+"的用户";
    }
}
