package main.exercise2;

import main.exercise2.domain.Movie;
import main.exercise2.service.InMemoryMovieService;
import main.exercise2.service.MovieService;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution6 {

    private static final MovieService movieService = InMemoryMovieService.getInstance();

    // Q.6) Find the year when the maximum number of movie is available
    public static void main(String[] args) {

        Collection<Movie> allMovies = movieService.findAllMovies();

        Map<Integer, Long> movieYearNumberMap = allMovies.stream()
                .collect(Collectors.groupingBy(Movie::getYear, Collectors.counting()));

        Optional<Map.Entry<Integer, Long>> maxNumberOfMovieInYear = movieYearNumberMap.entrySet().stream().max(Map.Entry.comparingByValue());
        maxNumberOfMovieInYear.ifPresent(System.out::println);
    }

}
