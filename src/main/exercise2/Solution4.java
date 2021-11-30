package main.exercise2;

import main.exercise2.domain.Movie;
import main.exercise2.service.InMemoryMovieService;
import main.exercise2.service.MovieService;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Solution4 {

    private static final MovieService movieService = InMemoryMovieService.getInstance();

    // Q.4) Group the movies by the year and list them
    public static void main(String[] args) {

        Map<Integer, List<Movie>> moviesByYear = movieService.findAllMovies()
                .stream().collect(groupingBy(Movie::getYear));

        moviesByYear.entrySet()
                        .stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

        //Set<Map.Entry<Integer, List<Movie>>> entries = moviesByYear.entrySet();


    }
}
