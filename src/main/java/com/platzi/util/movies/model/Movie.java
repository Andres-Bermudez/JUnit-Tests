package com.platzi.util.movies.model;

public class Movie {
    
    private Long id;
    private String name;
    private String genre;
    private int year;
    private String director;

    public Movie(Long id, String name, String genre, int year, String director) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.director = director;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return "\nMovie: " +
                "\nName: " + name +
                "\nGenre: " + genre +
                "\nYear: " + year +
                "\nDirector" + director;
    }
}
