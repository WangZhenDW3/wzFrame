package com.wz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wangzhen on 2018/7/31.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/test1")
    public String test1(){
        return "test";
    }

    @RequestMapping("/test2")
    public void test2(){
        System.out.println("ok");
        System.out.println("ok");
        System.out.println("ok");
    }

    @RequestMapping("/test3")
    public void test3(){
        System.out.println("ok");
        System.out.println("ok33333333333");
        System.out.println("ok33333333333");
        System.out.println("ok33333");
    }
}
