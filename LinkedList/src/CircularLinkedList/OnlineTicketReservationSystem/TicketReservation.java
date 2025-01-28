package CircularLinkedList.OnlineTicketReservationSystem;

public class TicketReservation{
    private Ticket last;

    // Method to add a new ticket at the end of the circular list
    public void addTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);

        if (last == null) {
            // First ticket in the list
            last = newTicket;
            last.next = last;
        } else {
            newTicket.next = last.next;
            last.next = newTicket;
            last = newTicket;
        }
        System.out.println("Ticket added successfully: " + ticketId);
    }

    // Method to remove a ticket by Ticket ID
    public void removeTicket(int ticketId) {
        if (last == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        Ticket current = last.next;
        Ticket previous = last;

        do {
            if (current.ticketId == ticketId) {
                if (current == last && current.next == last) {
                    // Single ticket in the list
                    last = null;
                } else {
                    previous.next = current.next;
                    if (current == last) {
                        last = previous;
                    }
                }
                System.out.println("Ticket removed successfully: " + ticketId);
                return;
            }
            previous = current;
            current = current.next;
        } while (current != last.next);

        System.out.println("Ticket with ID " + ticketId + " not found.");
    }

    // Method to display all tickets
    public void displayTickets() {
        if (last == null) {
            System.out.println("No tickets available.");
            return;
        }

        Ticket current = last.next;
        System.out.println("Current Tickets:");
        do {
            System.out.println("Ticket ID: " + current.ticketId + ", Customer: " + current.customerName + ", Movie: " + current.movieName + ", Seat: " + current.seatNumber + ", Booking Time: " + current.bookingTime);
            current = current.next;
        } while (current != last.next);
    }

    // Method to search for a ticket by Customer Name or Movie Name
    public void searchTicket(String keyword) {
        if (last == null) {
            System.out.println("No tickets available.");
            return;
        }

        boolean found = false;
        Ticket current = last.next;
        do {
            if (current.customerName.equalsIgnoreCase(keyword) || current.movieName.equalsIgnoreCase(keyword)) {
                System.out.println("Ticket Found: Ticket ID: " + current.ticketId + ", Customer: " + current.customerName + ", Movie: " + current.movieName + ", Seat: " + current.seatNumber + ", Booking Time: " + current.bookingTime);
                found = true;
            }
            current = current.next;
        } while (current != last.next);

        if (!found) {
            System.out.println("No tickets found with keyword: " + keyword);
        }
    }

    // Method to calculate the total number of booked tickets
    public int countTickets() {
        if (last == null) {
            return 0;
        }

        int count = 0;
        Ticket current = last.next;
        do {
            count++;
            current = current.next;
        } while (current != last.next);

        return count;
    }
}
