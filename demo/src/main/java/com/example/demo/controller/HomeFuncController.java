package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeFuncController {
    @RequestMapping("/home/wines")
    public String getWinesPage() {
        return "/knowledge/wines";
    }

    @RequestMapping("/home/regions")
    public String getRegionsPage() {
        return "/knowledge/regions";
    }

    @RequestMapping("/home/wineries")
    public String getWineriesPage() {
        return "/knowledge/wineries";
    }

    @RequestMapping("/home/varieties")
    public String getVarietiesPage() {
        return "/knowledge/varieties";
    }

    @RequestMapping("/home/culture")
    public String getCulturePage() {
        return "/knowledge/culture";
    }

    @RequestMapping("/home/manners")
    public String getMannersPage() {
        return "/knowledge/manners";
    }
}
