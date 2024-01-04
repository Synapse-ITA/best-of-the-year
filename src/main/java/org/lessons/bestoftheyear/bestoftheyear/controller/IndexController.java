package org.lessons.bestoftheyear.bestoftheyear.controller;

import org.lessons.bestoftheyear.bestoftheyear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {
    @GetMapping("/home")
    public String home(Model model) {
        // Passa i valori desiderati al modello
        model.addAttribute("anno", 2023 );
        model.addAttribute("nome", "Valerio");
        return "home";
    }
    @RequestMapping("/songs")
    public String showSongs(Model model) {
        List<Song> songs = getSongs();
        model.addAttribute("songs", songs);
        return "songs";
    }
    // Metodo privato per ottenere la lista di canzoni
    private List<Song> getSongs() {
        // Elenco di canzoni
        List<Song> songs = new ArrayList<>();
        songs.add(new Song(1, "What is Love", "Haddaway"));
        songs.add(new Song(2, "Last Christmas", "Wham!"));
        songs.add(new Song(3, "Moth to a flame", "The Weeknd"));
        return songs;
    }

    @GetMapping("/details/{songId}")
    public String songDetails(@PathVariable Long songId, Model model) {
        return "songDetails";
    }


}
