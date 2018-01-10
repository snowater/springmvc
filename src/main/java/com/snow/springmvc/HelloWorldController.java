/**
 * @(#) HelloWorldController.java 2018/01/10
 * Copyright 2016 Snow.com, Inc. All rights reserved.
 */
package com.snow.springmvc;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author hzwanghuiqi
 * @version 2018/01/10
 */
public class HelloWorldController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", "this is a test!这是一个测试");
        modelAndView.setViewName("hello");

        return modelAndView;
    }
}
