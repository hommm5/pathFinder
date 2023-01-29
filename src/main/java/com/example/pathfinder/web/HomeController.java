package com.example.pathfinder.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/") //localhost:8080/
public class HomeController extends BaseController {

    @GetMapping //localhost:8080 -> get request
    public ModelAndView getHome() {
        return super.view("index");
    }
}
