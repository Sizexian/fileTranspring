package com.example.filetranspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebPageController {
    @RequestMapping("/")
    public ModelAndView webPage(){
        return new ModelAndView("fileupload");
    }
}
