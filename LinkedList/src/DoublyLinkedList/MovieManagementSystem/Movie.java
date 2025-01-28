package DoublyLinkedList.MovieManagementSystem;

class Movie {
    String title;
    String director;
    int yearOfRelease;
    double rating;
    Movie next; // Pointer to the next node
    Movie prev; // Pointer to the previous node

    // Constructor to initialize a movie node
    public Movie(String title, String director, int yearOfRelease, double rating) {
        this.title = title;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}