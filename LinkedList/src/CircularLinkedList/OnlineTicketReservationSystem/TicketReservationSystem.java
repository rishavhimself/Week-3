package CircularLinkedList.OnlineTicketReservationSystem;

public class TicketReservationSystem {
    public static void main(String[] args) {
        TicketReservation system = new TicketReservation();

        // Adding tickets
        system.addTicket(101, "Alice", "Avatar", "A1", "10:00 AM");
        system.addTicket(102, "Bob", "Inception", "B2", "12:00 PM");
        system.addTicket(103, "Charlie", "Interstellar", "C3", "2:00 PM");

        // Display all tickets
        system.displayTickets();

        // Search for a ticket
        system.searchTicket("Bob");
        system.searchTicket("Avatar");

        // Remove a ticket
        system.removeTicket(102);

        // Display all tickets after removal
        system.displayTickets();

        // Count total tickets
        System.out.println("Total tickets: " + system.countTickets());
    }
}