# 🏷️ FILE HANDLING UTILITY

*COMPANY* : CODTECH IT SOLUTIONS

*NAME*    : RAJKUMAR GUGULOTH

*INTERN ID* : CT06WC118

*DOMAIN*  : JAVA PROGRAMMING

*DURATION* : 6 WEEKS

*MENTOR*  : NEELA SANTHOSH KUMAR

# 📋 TASK DESCRIPTION:
*Overview of the Task* :
As part of my internship, I was assigned the task of developing a **Java-based Recommendation System** that suggests products or content based on user preferences.

While the initial idea was to explore libraries like **Apache Mahout**, I faced several compatibility and setup issues. As an alternative, 
I implemented a fully functional **content-based filtering** recommendation engine from scratch using **pure Java**.

This approach not only fulfills the core requirement but also helped me gain a strong understanding of how recommendation systems work internally.


# 🛠️ Tools and Technologies Used:
     ✅ Java (JDK 17)

     ✅ Java Collections Framework  
     
     ✅ Cosine Similarity Algorithm  
     

# 💡 Features:
     ✅Rate Movies: Users can rate movies based on their preferences.
     
     ✅ Recommend Movies: Suggests similar movies based on genres and ratings  
     
     ✅ Cosine Similarity: Measures how close two movies are based on their features  
    
     ✅ Sample Dataset: Contains a predefined list of movies with genres as features  
    
     ✅ Clean OOP Design: Separate classes for Movie, User, and Recommender

## 🚀 Which Editor Used:          *Eclipse*

# Task Execution:


---

# 🚀 Task Execution:

### 1. Simulating the Dataset:

==> Created in-memory preference data using GenericDataModel and FastByIDMap<PreferenceArray>

==> Simulated ratings by 3 users for 6 movies (rated between 3.0 to 5.0)

### 2. Implementing Mahout-based Recommendation Logic:

==> Used GenericItemBasedRecommender to implement item-based collaborative filtering

==> Used UncenteredCosineSimilarity as the similarity metric

==> For a given user ID, the system outputs a list of top N movie recommendations

### 3. Displaying Output with Movie Tags:

==> Added movie feature tags to each movie to make recommendations understandable

==> Displays user ID, recommended movie ID, movie title, and movie type

# 🧠 Sample Output:

#### TOP RECOMMENDED MOVIES FOR USER ID: 1

Movie ID: 106 | Title: Movie6 | Type: Drama

Movie ID: 105 | Title: Movie5 | Type: Comedy

#### TOP RECOMMENDED MOVIES FOR USER ID: 2

Movie ID: 106 | Title: Movie6 | Type: Drama

Movie ID: 104 | Title: Movie4 | Type: Action

#### TOP RECOMMENDED MOVIES FOR USER ID: 3

Movie ID: 105 | Title: Movie5 | Type: Comedy

Movie ID: 102 | Title: Movie2 | Type: Comedy



