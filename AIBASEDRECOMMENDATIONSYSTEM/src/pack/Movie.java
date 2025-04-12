package pack;

//Movie.java
import java.util.List;

/**
* Represents a movie with an ID and feature vector (e.g., genres).
*/
public class Movie {
 private int movieId;
 private List<Double> features;

 public Movie(int movieId, List<Double> features) {
     this.movieId = movieId;
     this.features = features;
 }

 public int getMovieId() {
     return movieId;
 }

 public List<Double> getFeatures() {
     return features;
 }
}
