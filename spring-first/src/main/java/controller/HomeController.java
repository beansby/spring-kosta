package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("data", "spring framework");
        return "index";
    }

    @GetMapping("/test")
    public String page(Model model){
        model.addAttribute("page", "test page");
        return "test";
    }
}
