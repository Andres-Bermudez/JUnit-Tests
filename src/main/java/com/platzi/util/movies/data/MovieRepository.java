package com.platzi.util.movies.data;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import com.platzi.util.movies.model.Genre;
import com.platzi.util.movies.model.Movie;

public class MovieRepository implements Repository {

    // Conexion a la base de datos.
    private Connection getConnection() throws SQLException {
        return DataBaseConnection.getConecction();
    }

    private Movie createMovie(ResultSet resultSet) throws SQLException {
        return new Movie(
                resultSet.getLong("id"),
                resultSet.getString("name"),
                resultSet.getString("genre"),
                resultSet.getInt("year"),
                resultSet.getString("director")
        );
    }

    @Override
    public Movie findById(Long id) {
        String sql = "SELECT * FROM movies WHERE id = ?";
        try (PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
        ) {
            preparedStatement.setLong(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return createMovie(resultSet);
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<Movie> findByGenre(Genre genre) {
        String sql = "SELECT * FROM movies WHERE genre = ?";
        try (PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
        ) {
            preparedStatement.setString(1, String.valueOf(genre));
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet != null) {
                    List<Movie> movies = new ArrayList<>();

                    while(resultSet.next()) {
                        movies.add(createMovie(resultSet));
                    }
                    return movies;
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<Movie> getAll() {
        String sql = "SELECT * FROM movies";
        try (Statement statement = getConnection().createStatement();
             ResultSet resultSet = statement.executeQuery(sql)
        ) {
            if (resultSet != null) {
                List<Movie> movies = new ArrayList<>();

                while(resultSet.next()) {
                    movies.add(createMovie(resultSet));
                }
                return movies;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
