package DoublyLinkedList.MovieManagementSystem;

public class MovieLinkedList {

    private Movie head; // Head of the doubly linked list
    private Movie tail; // Tail of the doubly linked list

    // Method to add a movie at the beginning
    public void addMovieAtBeginning(String title, String director, int yearOfRelease, double rating) {
        Movie newMovie = new Movie(title, director, yearOfRelease, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    // Method to add a movie at the end
    public void addMovieAtEnd(String title, String director, int yearOfRelease, double rating) {
        Movie newMovie = new Movie(title, director, yearOfRelease, rating);
        if (tail == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    // Method to add a movie at a specific position
    public void addMovieAtPosition(int position, String title, String director, int yearOfRelease, double rating) {
        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }

        Movie newMovie = new Movie(title, director, yearOfRelease, rating);
        if (position == 1) {
            addMovieAtBeginning(title, director, yearOfRelease, rating);
            return;
        }

        Movie current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Position out of range");
            return;
        }

        newMovie.next = current.next;
        newMovie.prev = current;
        if (current.next != null) {
            current.next.prev = newMovie;
        } else {
            tail = newMovie;
        }
        current.next = newMovie;
    }

    // Method to remove a movie by title
    public void removeMovieByTitle(String title) {
        if (head == null) {
            System.out.println("No movie records found.");
            return;
        }

        Movie current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }

                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }

                System.out.println("Movie with Title '" + title + "' removed.");
                return;
            }
            current = current.next;
        }
        System.out.println("Movie with Title '" + title + "' not found.");
    }

    // Method to search for movies by director or rating
    public void searchMovieByDirectorOrRating(String director, Double rating) {
        if (head == null) {
            System.out.println("No movie records found.");
            return;
        }

        boolean found = false;
        Movie current = head;
        while (current != null) {
            if ((director != null && current.director.equalsIgnoreCase(director)) ||
                    (rating != null && current.rating == rating)) {
                System.out.println("Movie Found: Title: " + current.title + ", Director: " + current.director + ", Year: " + current.yearOfRelease + ", Rating: " + current.rating);
                found = true;
            }
            current = current.next;
        }

        if (!found) {
            System.out.println("No movies found with the specified criteria.");
        }
    }

    // Method to display all movies in forward order
    public void displayMoviesForward() {
        if (head == null) {
            System.out.println("No movie records found.");
            return;
        }

        System.out.println("Movies in Forward Order:");
        Movie current = head;
        while (current != null) {
            System.out.println("Title: " + current.title + ", Director: " + current.director + ", Year: " + current.yearOfRelease + ", Rating: " + current.rating);
            current = current.next;
        }
    }

    // Method to display all movies in reverse order
    public void displayMoviesReverse() {
        if (tail == null) {
            System.out.println("No movie records found.");
            return;
        }

        System.out.println("Movies in Reverse Order:");
        Movie current = tail;
        while (current != null) {
            System.out.println("Title: " + current.title + ", Director: " + current.director + ", Year: " + current.yearOfRelease + ", Rating: " + current.rating);
            current = current.prev;
        }
    }

    // Method to update a movie's rating by title
    public void updateMovieRating(String title, double newRating) {
        Movie current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                current.rating = newRating;
                System.out.println("Rating updated for Movie: " + title);
                return;
            }
            current = current.next;
        }
        System.out.println("Movie with Title '" + title + "' not found.");
    }
}
