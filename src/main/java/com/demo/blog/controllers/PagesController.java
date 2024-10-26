package com.demo.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesController {

    @GetMapping("/technology")
    public String technologyPage(Model model) {
        model.addAttribute("title", "Technology");
        return "technology";
    }

    @GetMapping("/culture")
    public String culturePage(Model model) {
        model.addAttribute("title", "Culture");
        return "culture";
    }

    @GetMapping("/business")
    public String businessPage(Model model) {
        model.addAttribute("title", "Business");
        return "business";
    }

    @GetMapping("/health")
    public String healthPage(Model model) {
        model.addAttribute("title", "Health");
        return "health";
    }

    @GetMapping("/science")
    public String sciencePage(Model model) {
        model.addAttribute("title", "Science");
        return "science";
    }

    @GetMapping("/style")
    public String stylePage(Model model) {
        model.addAttribute("title", "Style");
        return "style";
    }

    @GetMapping("/travel")
    public String travelPage(Model model) {
        model.addAttribute("title", "Travel");
        return "travel";
    }
}
