package main.exercise2.service;

import java.util.Collection;
import java.util.List;

import main.exercise2.domain.Director;
import main.exercise2.domain.Genre;
import main.exercise2.domain.Movie;

public interface MovieService {
	Movie findMovieById(int id);

	Collection<Movie> findAllMovies();

	Collection<Movie> findAllMoviesByYearRange(int fromYear, int toYear);

	Collection<Movie> findAllMoviesByDirectorId(int directorId);

	Collection<Movie> findAllMoviesByYearRangeAndGenre(String genre, int fromYear, int toYear);

	Collection<Movie> findAllMoviesByGenre(String genre);

	Movie addMovie(int id, String title, int year, String imdb, List<Genre> genres, List<Director> directors);

	Genre findGenreByName(String genre);

	Collection<Genre> findAllGenres();

	Collection<Director> findAllDirectors();
}
