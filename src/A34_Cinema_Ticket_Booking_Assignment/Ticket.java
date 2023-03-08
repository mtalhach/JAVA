package A34_Cinema_Ticket_Booking_Assignment;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ticket {
    private int noCounter = 1;
    private int number;
    private final DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MMM d yyy 'at' h:mm a");
    private String dateTime;
    private final int inVoiceAmount;
    private final Seat seat;

    Ticket(Seat seat){
        number=noCounter++;
        inVoiceAmount= (int)(Math.random()*4001)+1000;
        dateTime= LocalDateTime.now().format(formatter);
        this.seat=seat;
    }

    public int getNumber(){
        return this.number;
    }
    public String getDateTime(){
        return dateTime;
    }
    public int getInvoiceAmount() {
        return inVoiceAmount;
    }
    public Seat getSeat(){
        return seat;
    }

}