package ru.netology;

public class Movie {
    private int id;
    private String name;
    private String genre;
    private String imageUrl;

    public Movie(int id, String name, String genre, String imageUrl) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.imageUrl = imageUrl;
    }
}
