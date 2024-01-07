package org.lessons.bestoftheyear.bestoftheyear.controller;

import org.lessons.bestoftheyear.bestoftheyear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("/home")
    public String home(Model model) {
        // Passa i valori desiderati al modello
        model.addAttribute("anno", 2023 );
        model.addAttribute("nome", "Valerio");
        return "home";
    }

}
