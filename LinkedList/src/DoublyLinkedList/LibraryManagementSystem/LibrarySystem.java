package DoublyLinkedList.LibraryManagementSystem;

public class LibrarySystem {
        private Book head;
        private Book tail;

        // Method to add a book at the beginning
        public void addBookAtBeginning(String title, String author, String genre, int bookId, boolean isAvailable) {
            Book newBook = new Book(title, author, genre, bookId, isAvailable);
            if (head == null) {
                head = tail = newBook;
            } else {
                newBook.next = head;
                head.prev = newBook;
                head = newBook;
            }
        }

        // Method to add a book at the end
        public void addBookAtEnd(String title, String author, String genre, int bookId, boolean isAvailable) {
            Book newBook = new Book(title, author, genre, bookId, isAvailable);
            if (head == null) {
                head = tail = newBook;
            } else {
                tail.next = newBook;
                newBook.prev = tail;
                tail = newBook;
            }
        }

        // Method to add a book at a specific position
        public void addBookAtPosition(int position, String title, String author, String genre, int bookId, boolean isAvailable) {
            if (position < 1) {
                System.out.println("Invalid position");
                return;
            }

            Book newBook = new Book(title, author, genre, bookId, isAvailable);
            if (position == 1) {
                addBookAtBeginning(title, author, genre, bookId, isAvailable);
                return;
            }

            Book current = head;
            for (int i = 1; i < position - 1 && current != null; i++) {
                current = current.next;
            }

            if (current == null) {
                addBookAtEnd(title, author, genre, bookId, isAvailable);
            } else {
                newBook.next = current.next;
                newBook.prev = current;
                if (current.next != null) {
                    current.next.prev = newBook;
                }
                current.next = newBook;
                if (newBook.next == null) {
                    tail = newBook;
                }
            }
        }

        // Method to remove a book by Book ID
        public void removeBookById(int bookId) {
            if (head == null) {
                System.out.println("No books available.");
                return;
            }

            Book current = head;
            while (current != null) {
                if (current.bookId == bookId) {
                    if (current == head) {
                        head = head.next;
                        if (head != null) {
                            head.prev = null;
                        } else {
                            tail = null;
                        }
                    } else if (current == tail) {
                        tail = tail.prev;
                        tail.next = null;
                    } else {
                        current.prev.next = current.next;
                        current.next.prev = current.prev;
                    }
                    System.out.println("Book with ID " + bookId + " removed.");
                    return;
                }
                current = current.next;
            }

            System.out.println("Book with ID " + bookId + " not found.");
        }

        // Method to search for a book by title or author
        public void searchBook(String keyword) {
            if (head == null) {
                System.out.println("No books available.");
                return;
            }

            boolean found = false;
            Book current = head;
            while (current != null) {
                if (current.title.equalsIgnoreCase(keyword) || current.author.equalsIgnoreCase(keyword)) {
                    System.out.println("Book Found: Title: " + current.title + ", Author: " + current.author + ", Genre: " + current.genre + ", ID: " + current.bookId + ", Available: " + current.isAvailable);
                    found = true;
                }
                current = current.next;
            }

            if (!found) {
                System.out.println("No books found with keyword: " + keyword);
            }
        }

        // Method to update a book's availability status
        public void updateBookAvailability(int bookId, boolean isAvailable) {
            if (head == null) {
                System.out.println("No books available.");
                return;
            }

            Book current = head;
            while (current != null) {
                if (current.bookId == bookId) {
                    current.isAvailable = isAvailable;
                    System.out.println("Book with ID " + bookId + " updated to " + (isAvailable ? "Available" : "Unavailable"));
                    return;
                }
                current = current.next;
            }

            System.out.println("Book with ID " + bookId + " not found.");
        }

        // Method to display all books in forward order
        public void displayBooksForward() {
            if (head == null) {
                System.out.println("No books available.");
                return;
            }

            System.out.println("Books in Forward Order:");
            Book current = head;
            while (current != null) {
                System.out.println("Title: " + current.title + ", Author: " + current.author + ", Genre: " + current.genre + ", ID: " + current.bookId + ", Available: " + current.isAvailable);
                current = current.next;
            }
        }

        // Method to display all books in reverse order
        public void displayBooksReverse() {
            if (tail == null) {
                System.out.println("No books available.");
                return;
            }

            System.out.println("Books in Reverse Order:");
            Book current = tail;
            while (current != null) {
                System.out.println("Title: " + current.title + ", Author: " + current.author + ", Genre: " + current.genre + ", ID: " + current.bookId + ", Available: " + current.isAvailable);
                current = current.prev;
            }
        }

        // Method to count the total number of books
        public int countBooks() {
            int count = 0;
            Book current = head;
            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
        }
}
