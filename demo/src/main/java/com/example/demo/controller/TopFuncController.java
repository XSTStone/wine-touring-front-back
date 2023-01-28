package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TopFuncController {

    @RequestMapping("/home")
    public String getHomePage() {
        return "home";
    }

    @RequestMapping("factor")
    public String getFactorPage() {
        return "factor";
    }

    @RequestMapping("rank")
    public String getRankPage() {
        return "rank";
    }

    @RequestMapping("evaluate")
    public String getEvaluatePage() {
        return "evaluate";
    }
}
