package us.zachandes.first.service;

import org.springframework.stereotype.Service;
import us.zachandes.first.controllers.Movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MovieService {
    private List<Movie> movies = new ArrayList<>(
            Arrays.asList(
            new Movie("3 - Enjoy", "Action"),
            new Movie("2 - Ambivalent", "Horror"),
            new Movie("3 - Enjoy", "Comedy"),
            new Movie("1 - Dislike", "Romance"),
            new Movie("4 - Love", "Science Fiction")
    ));

    public List<Movie> getAllMovies(){
        return movies;
    }

    public Movie getMovie(String id){
        return movies.stream().filter(m -> m.getGenre().contains(id)).findFirst().get();
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }

    public void updateMovie(Movie movie, String id){
        for(int i = 0; i < movies.size(); i++){
            Movie m = movies.get(i);
            if(m.getGenre().equals(id)){
                movies.set(i, movie);
                return;
            }
        }
    }

    public void deleteMovie(String id){
        movies.removeIf(m -> m.getGenre().equals(id));
    }
}
