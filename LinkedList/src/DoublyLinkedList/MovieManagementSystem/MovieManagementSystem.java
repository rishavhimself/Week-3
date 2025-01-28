package DoublyLinkedList.MovieManagementSystem;

public class MovieManagementSystem {

    public static void main(String[] args) {
        MovieLinkedList movieList = new MovieLinkedList();

        // Adding movies
        movieList.addMovieAtBeginning("Inception", "Christopher Nolan", 2010, 8.8);
        movieList.addMovieAtEnd("The Godfather", "Francis Ford Coppola", 1972, 9.2);
        movieList.addMovieAtPosition(2, "The Dark Knight", "Christopher Nolan", 2008, 9.0);

        // Display movies
        movieList.displayMoviesForward();

        // Search for a movie
        movieList.searchMovieByDirectorOrRating("Christopher Nolan", null);
        movieList.searchMovieByDirectorOrRating(null, 9.2);

        // Update a movie's rating
        movieList.updateMovieRating("Inception", 9.0);

        // Remove a movie
        movieList.removeMovieByTitle("The Godfather");

        // Display movies in reverse order
        movieList.displayMoviesReverse();
    }
}
