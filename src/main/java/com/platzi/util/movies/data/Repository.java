package com.platzi.util.movies.data;

import java.util.List;
import com.platzi.util.movies.model.Genre;
import com.platzi.util.movies.model.Movie;

public interface Repository {

    Movie findById(Long id);
    List<Movie> findByGenre(Genre genre);
    List<Movie> getAll();
}
