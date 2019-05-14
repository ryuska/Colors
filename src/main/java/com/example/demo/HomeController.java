package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @GetMapping("/colorform")
    public String loadForm(Model model){
        model.addAttribute("color", new Color());
        return "colorform";
    }
    @PostMapping("/colorform")
    public String processForm(@Valid Color color,
                              BindingResult result){
        if (result.hasErrors()){
            return "colorform";

        }
        return "confirm";

    }
}
