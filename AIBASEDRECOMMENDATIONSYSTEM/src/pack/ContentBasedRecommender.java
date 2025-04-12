package pack;

//ContentBasedRecommender.java
import java.util.*;

/**
* Provides content-based movie recommendations using cosine similarity.
*/
public class ContentBasedRecommender {

 /**
  * Calculates cosine similarity between two movies.
  */
 public double calculateCosineSimilarity(Movie movie1, Movie movie2) {
     List<Double> features1 = movie1.getFeatures();
     List<Double> features2 = movie2.getFeatures();

     double dotProduct = 0.0;
     double norm1 = 0.0;
     double norm2 = 0.0;

     for (int i = 0; i < features1.size(); i++) {
         dotProduct += features1.get(i) * features2.get(i);
         norm1 += Math.pow(features1.get(i), 2);
         norm2 += Math.pow(features2.get(i), 2);
     }

     if (norm1 == 0 || norm2 == 0) return 0.0;

     return dotProduct / (Math.sqrt(norm1) * Math.sqrt(norm2));
 }

 /**
  * Recommends top N movies based on user's rated movies and similarity.
  */
 public List<Movie> recommendMovies(User user, List<Movie> movies, int topN) {
     Map<Integer, Double> userRatings = user.getRatings();
     Map<Integer, Double> scores = new HashMap<>();

     for (Movie ratedMovie : movies) {
         if (!userRatings.containsKey(ratedMovie.getMovieId())) continue;

         double userRating = userRatings.get(ratedMovie.getMovieId());

         for (Movie otherMovie : movies) {
             if (ratedMovie.getMovieId() == otherMovie.getMovieId() ||
                 userRatings.containsKey(otherMovie.getMovieId())) continue;

             double similarity = calculateCosineSimilarity(ratedMovie, otherMovie);
             scores.put(otherMovie.getMovieId(),
                     scores.getOrDefault(otherMovie.getMovieId(), 0.0) + similarity * userRating);
         }
     }

     List<Map.Entry<Integer, Double>> sortedMovies = new ArrayList<>(scores.entrySet());
     sortedMovies.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));

     List<Movie> recommendations = new ArrayList<>();
     for (int i = 0; i < Math.min(topN, sortedMovies.size()); i++) {
         int movieId = sortedMovies.get(i).getKey();
         for (Movie movie : movies) {
             if (movie.getMovieId() == movieId) {
                 recommendations.add(movie);
                 break;
             }
         }
     }

     return recommendations;
 }
}
