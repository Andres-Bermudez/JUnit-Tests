package com.platzi.util.movies.data;

import java.sql.Connection;
import java.sql.DriverManager;
import org.junit.jupiter.api.Test;
import java.sql.PreparedStatement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import com.platzi.util.movies.model.Movie;
import static org.junit.jupiter.api.Assertions.*;

class MovieRepositoryIntegrationTest {

    private Connection connection;

    // Este metodo se ejecuta antes de ejecutar cada test.
    // Este metodo crea una base de datos en memoria y luego crea una tabla
    // e inserta datos de prueba.
    @BeforeEach
    void setUp() throws Exception {
        connection = DriverManager.getConnection(
                "jdbc:h2:mem:testdb;MODE=MySQL;DB_CLOSE_DELAY=-1",
                "sa",
                ""
        );

        // Crea la tabla movies
        String createTableSQL = """
                                CREATE TABLE movies(
                                    id INT AUTO_INCREMENT PRIMARY KEY,
                                    name VARCHAR(100) NOT NULL UNIQUE,
                                    genre VARCHAR(100) NOT NULL,
                                    year YEAR NOT NULL,
                                    director VARCHAR(50) NOT NULL
                                );
                                """;
        try (PreparedStatement preparedStatement = connection.prepareStatement(createTableSQL)) {
            preparedStatement.execute();
        }

        // Inserta datos de prueba
        String insertDataSQL = """
                               INSERT INTO movies (name, genre, year, director) VALUES
                               ('Inception', 'ACTION', 2010, 'Christopher Nolan'),
                               ('The Godfather', 'ACTION', 1972, 'Francis Ford Coppola'),
                               ('Pulp Fiction', 'ACTION', 1994, 'Quentin Tarantino'),
                               ('The Dark Knight', 'COMEDY', 2008, 'Christopher Nolan'),
                               ('Interstellar', 'ACTION', 2014, 'Christopher Nolan');
                               """;
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertDataSQL)) {
            preparedStatement.execute();
        }
    }

    // Este metodo se ejecuta despues de cada test. Elimina la tabla creada anteriormente
    // para poder hacer el test con datos completamente nuevos.
    @AfterEach
    void tearDown() throws Exception {
        // Limpia la base de datos
        try (PreparedStatement preparedStatement =
                     connection.prepareStatement("DROP TABLE movies")
        ) {
            preparedStatement.execute();
        }
        connection.close();
    }

    @Test
    @DisplayName("Se encuentra una pelicula por su ID")
    void findByIdSuccess() throws Exception {
        // Repositorio que utiliza la conexión configurada
        MovieRepository repository = new MovieRepository() {
            protected Connection getConnection() {
                return connection;
            }
        };

        // Ejecución
        Movie movie = repository.findById(1L);

        // Verificación
        assertNotNull(movie);
        assertEquals(1L, movie.getId());
        assertEquals("Inception", movie.getName());
        assertEquals("ACTION", movie.getGenre());
    }

    @Test
    @DisplayName("NO se encuentra una pelicula por su ID")
    void findByIdNotFound() throws Exception {
        // Repositorio que utiliza la conexión configurada
        MovieRepository repository = new MovieRepository() {
            protected Connection getConnection() {
                return connection;
            }
        };

        // Ejecución
        Movie movie = repository.findById(99L);

        // Verificación
        assertNull(movie);
    }
}
