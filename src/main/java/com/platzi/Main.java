package com.platzi;

import java.util.List;
import com.platzi.util.movies.model.Genre;
import com.platzi.util.movies.model.Movie;
import com.platzi.util.movies.service.MovieService;
import com.platzi.util.movies.data.MovieRepository;

public class Main {

    public static void main(String[] args) throws IllegalArgumentException {

        // Test manual de conexion la base de datos.
        MovieService movieService = new MovieService(new MovieRepository());

        System.out.println("\n--------- Buscar pelicula por id ---------");
        System.out.println(movieService.findById(1L));

        System.out.println("\n--------- Obtener todas las peliculas ---------");
        List<Movie> movieList = movieService.getAll();
        for (Movie movie : movieList) {
            System.out.println(movie);
        }

        System.out.println("\n--------- Buscar pelicula por genero ---------");
        List<Movie> movieList2 = movieService.findByGenre(Genre.COMEDY);
        for (Movie movie : movieList2) {
            System.out.println(movie);
        }
    }
}
