package com.example.task3new;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {
    @GetMapping("/index")
    public String getPage(Model model){
        return "index";
    }

    @PostMapping("/index")
    public String getRedirectPage(@RequestParam("language") String radioLanguage){
        if (radioLanguage.equals("Russian")){
            return "redirect:/index?russian";
        }

        return "redirect:/index?english";

    }
}
