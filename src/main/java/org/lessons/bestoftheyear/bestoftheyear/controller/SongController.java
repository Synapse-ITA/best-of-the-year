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
@RequestMapping("/songs")
public class SongController {
    @GetMapping
    public String showSongs(Model model) {
        List<Song> songs = getSongs();
        model.addAttribute("songs", songs);
        return "songs";
    }

    // METODO SIMULAZIONE ARRAY
    private List<Song> getSongs() {
        // Elenco di canzoni
        List<Song> songs = new ArrayList<>();
        songs.add(new Song(1, "What is Love", "Haddaway"));
        songs.add(new Song(2, "Last Christmas", "Wham!"));
        songs.add(new Song(3, "Moth to a flame", "The Weeknd"));
        return songs;
    }

    // METODO DETTAGLI SONG
    @GetMapping("/{id}")
    public String songDetails(@PathVariable(name = "id") int songId, Model model) {
        Song song = getSongById(songId);
        model.addAttribute("songId", songId);
        model.addAttribute("song", song);

        return "songDetails";
    }


        // METODO PER RICERCARE L'ID DELLA CANZONE
     private Song getSongById(int id){
        List<Song> songList = getSongs();
        for(Song song : songList){
            if(song.getId() == id){
                return song;
            }
        }
        return null;
    }

}



