package com.platzi.util.movies.service;

import java.util.List;
import com.platzi.util.movies.model.Genre;
import com.platzi.util.movies.model.Movie;
import com.platzi.util.movies.data.MovieRepository;

public class MovieService {

    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie findById(Long id) {
        return movieRepository.findById(id);
    }

    public List<Movie> getAll() {
        return movieRepository.getAll();
    }

    public List<Movie> findByGenre(Genre genre) {
        return movieRepository.findByGenre(genre);
    }
}
