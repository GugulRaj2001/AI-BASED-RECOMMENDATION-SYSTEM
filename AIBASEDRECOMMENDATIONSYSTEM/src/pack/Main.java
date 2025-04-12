package pack;

//Main.java
import java.util.Arrays;
import java.util.List;

/**
* Main class to demonstrate movie recommendation.
*/
public class Main {
 public static void main(String[] args) {
     List<Movie> movies = Arrays.asList(
             new Movie(1, Arrays.asList(1.0, 0.0, 0.0)), // Action
             new Movie(2, Arrays.asList(0.0, 1.0, 0.0)), // Comedy
             new Movie(3, Arrays.asList(1.0, 1.0, 0.0)), // Action + Comedy
             new Movie(4, Arrays.asList(0.0, 0.0, 1.0)), // Drama
             new Movie(5, Arrays.asList(1.0, 0.0, 1.0))  // Action + Drama
     );

     User user = new User();
     user.rateMovie(1, 5.0); // Likes action
     user.rateMovie(2, 3.0); // Likes comedy moderately

     ContentBasedRecommender recommender = new ContentBasedRecommender();
     List<Movie> recommendedMovies = recommender.recommendMovies(user, movies, 3);

     System.out.println("Recommended Movies:");
     for (Movie movie : recommendedMovies) {
         System.out.println("Movie ID: " + movie.getMovieId() + " | Features: " + movie.getFeatures());
     }
 }
}
