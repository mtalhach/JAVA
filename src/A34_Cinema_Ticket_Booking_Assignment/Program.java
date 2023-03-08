package A34_Cinema_Ticket_Booking_Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
        private final Seat[][] seats = new Seat[15][];
        private final ArrayList<Ticket> tickets = new ArrayList<>();
        private final Scanner sc = new Scanner(System.in);
        private int totalSeats;
        private int bookedSeats;

        public Program() {
            for (int i = 0; i < 15; i++) {
                if (i > 10) {
                    seats[i] = new Seat[28];
                } else {
                    seats[i] = new Seat[18+i];
                }
                for (int j = 0; j < seats[i].length; j++) {
                    seats[i][j] = new Seat(i+1, j+1);
                    totalSeats++;
                }
            }
        }

        private void bookTicket() {
            Seat seat = null;
            search: for (Seat[] row: seats) {
                for (Seat col: row) {
                    if (col.isAvailable()) {
                        seat = col;
                        seat.book();
                        bookedSeats++;
                        break search;
                    }
                }
            }
            if (seat == null) {
                System.out.println("\nSorry, No seats available");
            } else {
                Ticket ticket = new Ticket(seat);
                System.out.println("\nTicket Details:-");
                System.out.printf("""
					Ticket Number      : %d
					Cinema Date & Time : %s
					Invoice Amount     : Rs. %d
					Seat               : Row %d, Column %d
					""",
                        ticket.getNumber(), ticket.getDateTime(), ticket.getInvoiceAmount(),
                        ticket.getSeat().getRow(), ticket.getSeat().getCol()
                );
                System.out.print("Are you sure want to book this ticket (Y/n)? ");
                char ch = sc.next().charAt(0); sc.nextLine();
                if (ch == 'y' || ch == 'Y') {
                    System.out.println("Ticket Booked");
                } else {
                    System.out.println("Booking Cancelled");
                }
                tickets.add(ticket);
            }
        }

        private void cancelTicket() {
            System.out.print("\nEnter ticket number to cancel: ");
            int ticketNumber = sc.nextInt();
            Ticket ticket = null;
            for (Ticket t: tickets) {
                if (t.getNumber() == ticketNumber) {
                    ticket = t;
                    break;
                }
            }
            if (ticket == null) {
                System.out.println("Ticket with ticket number "+ticketNumber+" not found");
            } else {
                System.out.println("\nTicket Details:-");
                System.out.printf("""
					Ticket Number      : %d
					Cinema Date & Time : %s
					Invoice Amount     : Rs. %d
					Seat               : Row %d, Column %d
					""",
                        ticket.getNumber(), ticket.getDateTime(), ticket.getInvoiceAmount(),
                        ticket.getSeat().getRow(), ticket.getSeat().getCol()
                );
                System.out.print("Are you sure want to cancel this ticket (Y/n)? ");
                char ch = sc.next().charAt(0);
                if (ch == 'Y' || ch == 'y') {
                    System.out.println("\nTicket with ticket number "+ticketNumber+" cancelled");
                    tickets.remove(ticket);
                    ticket.getSeat().unBook();
                    bookedSeats--;
                } else {
                    System.out.println("Ok");
                }
            }
        }

        private void checkAvailableSeats() {
            System.out.println("\nTotal Seats     = "+totalSeats);
            System.out.println("Booked Seats    = "+bookedSeats);
            System.out.println("Available Seats = "+(totalSeats-bookedSeats));
        }

        private void displayTotalRevenue() {
            int totalRevenue = 0;
            for (Ticket ticket: tickets) {
                totalRevenue += ticket.getInvoiceAmount();
            }
            System.out.println("\nTotal Revenue = Rs. "+totalRevenue);
        }

        public void start() {
            System.out.println("CINEMA TICKETING SYSTEM");
            System.out.println("=======================");

            while (true){
                System.out.println("1 - Book a ticket");
                System.out.println("2 - Cancel a ticket");
                System.out.println("3 - Check available seats");
                System.out.println("4 - Display total revenue");
                System.out.println("0 - Exit the program");
                System.out.println("Enter choice:");
                int choice;
                choice = sc.nextInt();
                if (choice==1){
                    bookTicket();
                }
                if (choice==2){
                    cancelTicket();
                }
                if (choice==3){
                    checkAvailableSeats();
                }
                if (choice==4){
                    displayTotalRevenue();
                }
                if (choice==0){
                    System.out.println("Thank You ");
                    break;
                }
            }

        }
    }

