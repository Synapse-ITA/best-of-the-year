package org.lessons.bestoftheyear.bestoftheyear.model;

public class Song {
    // ATTRIBUTI

    private int id;
    private String title;
    private String author;

    // COSTRUTTORE

    public Song(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    // GETTER AND SETTER
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    // METODI


}
