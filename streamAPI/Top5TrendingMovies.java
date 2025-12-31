package streamAPI;
import java.util.*;
import java.util.stream.Collectors;

public class Top5TrendingMovies {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
            new Movie("Movie1", 8.7, 2022),
            new Movie("Movie2", 9.0, 2023),
            new Movie("Movie3", 7.5, 2021),
            new Movie("Movie4", 9.5, 2023),
            new Movie("Movie5", 8.9, 2022),
            new Movie("Movie6", 8.2, 2023),
            new Movie("Movie7", 9.1, 2022)
        );

        List<Movie> top5 = movies.stream()
            .sorted(Comparator.comparingDouble(Movie::getRating).reversed()
                .thenComparing(Movie::getReleaseYear, Comparator.reverseOrder()))
            .limit(5)
            .collect(Collectors.toList());

        top5.forEach(System.out::println);
    }
}

class Movie {
    private String title;
    private double rating;
    private int releaseYear;

    public Movie(String title, double rating, int releaseYear) {
        this.title = title;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }

    public double getRating() { return rating; }
    public int getReleaseYear() { return releaseYear; }

    @Override
    public String toString() {
        return title + " (" + releaseYear + ") - Rating: " + rating;
    }
}
