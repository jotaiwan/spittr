package com.spittr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by jotaiwan on 18/06/2017.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(method=GET)
    public String home() {
        return "home";
    }
}
