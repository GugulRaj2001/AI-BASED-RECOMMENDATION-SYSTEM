package pack;

//User.java
import java.util.HashMap;
import java.util.Map;

/**
* Represents a user with a map of movie ratings.
*/
public class User {
 private Map<Integer, Double> ratings;

 public User() {
     this.ratings = new HashMap<>();
 }

 public void rateMovie(int movieId, double rating) {
     ratings.put(movieId, rating);
 }

 public Map<Integer, Double> getRatings() {
     return ratings;
 }
}
