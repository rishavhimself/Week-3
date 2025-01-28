package DoublyLinkedList.LibraryManagementSystem;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();

        // Adding books
        library.addBookAtBeginning("Book A", "Author A", "Fiction", 1, true);
        library.addBookAtEnd("Book B", "Author B", "Non-Fiction", 2, true);
        library.addBookAtPosition(2, "Book C", "Author C", "Fantasy", 3, false);

        // Display all books
        library.displayBooksForward();

        // Display books in reverse order
        library.displayBooksReverse();

        // Search for a book
        library.searchBook("Author B");

        // Update availability status
        library.updateBookAvailability(2, false);

        // Remove a book
        library.removeBookById(1);

        // Display all books after removal
        library.displayBooksForward();

        // Count total books
        System.out.println("Total books in library: " + library.countBooks());
    }
}
