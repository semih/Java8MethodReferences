package main.exercise2;

import main.exercise2.domain.Movie;
import main.exercise2.service.InMemoryMovieService;
import main.exercise2.service.MovieService;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Solution3 {
    private static final MovieService movieService = InMemoryMovieService.getInstance();
    private static Predicate<Movie> comedy = movie -> movie.getGenres().stream().allMatch(genre -> genre.getName().equals("Comedy"));
    private static Predicate<Movie> drama = movie -> movie.getGenres().stream().allMatch(genre -> genre.getName().equals("Drama"));
    private static Predicate<Movie> twoGenresOnly = movie -> movie.getGenres().size() == 2;

    // Q.3) Find the list of movies having the genres "Drama" and "Comedy" only
    public static void main(String[] args) {

        List<Movie> movieList = movieService.findAllMovies()
                .stream()
                .filter(comedy.and(drama))
                .filter(twoGenresOnly)
                .collect(Collectors.toList());

        movieList.forEach(m-> System.out.println(m.getTitle() + " - " + m.getGenres()));

    }
}
