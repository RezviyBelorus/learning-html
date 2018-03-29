package stream_api;

import stream_api.entity.Movie;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListSortObject {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("River", 9.0));
        movies.add(new Movie("Aggro monsters", 3.5));
        movies.add(new Movie("River", 8.2));

        System.out.println(movies);

        movies.sort(Comparator.comparing(Movie::getTitle));

        System.out.println(movies);


        movies.sort((o1, o2) -> {
            if (o1.getTitle().equals(o2.getTitle())) {
                return Double.compare(o1.getRating(), o2.getRating());
            }
            return o1.getTitle().compareTo(o2.getTitle());
        });

        System.out.println(movies);
    }
}
