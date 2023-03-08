package A34_Cinema_Ticket_Booking_Assignment;

public class Seat {
    private boolean isAvailable;
    private final int row,col;

    public Seat(int row,int col){
        this.row=row;
        this.col=col;
        isAvailable=true;
    }
    public void book(){
        isAvailable=false;
    }
    public void unBook(){
        isAvailable=true;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public int getRow(){
        return row;
    }
    public int getCol(){
        return col;
    }

}




