/**
 * @(#) HelloWorldController.java 2018/01/10
 * Copyright 2016 Snow.com, Inc. All rights reserved.
 */
package com.snow.springmvc;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author hzwanghuiqi
 * @version 2018/01/10
 */

@Controller
@RequestMapping("/")
public class HelloWorldController {

    @RequestMapping(value = "hello")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", "this is a test!这是一个测试");
        modelAndView.setViewName("hello");

        return modelAndView;
    }
}
