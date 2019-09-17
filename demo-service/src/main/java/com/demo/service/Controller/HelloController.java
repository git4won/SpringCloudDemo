package com.demo.service.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhengfuyuan
 * @Date: 2019/9/17
 * @Description:
 */
@RestController
public class HelloController {

    @RequestMapping(value = {"/hello"}, method = RequestMethod.GET)
    public String hello() {
        return "Hello!";
    }
}
