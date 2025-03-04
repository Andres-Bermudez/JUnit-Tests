package com.platzi.util.movies.model;

import java.util.Objects;

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

    public Long getId() {
        return id;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return year == movie.year &&
                Objects.equals(id, movie.id) &&
                Objects.equals(name, movie.name) &&
                Objects.equals(genre, movie.genre) &&
                Objects.equals(director, movie.director);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, genre, year, director);
    }
}
