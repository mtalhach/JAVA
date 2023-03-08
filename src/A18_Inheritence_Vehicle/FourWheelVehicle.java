package A18_Inheritence_Vehicle;

public class FourWheelVehicle extends Vehicle{
    private int numberOfWheel;
    private int numberOfSeats;

    public FourWheelVehicle(String registrationNo,String ChassisNo,String maker,String color,int numberOfWheel,int numberOfSeats){
        super(registrationNo,ChassisNo,maker,color);
        this.numberOfWheel=numberOfWheel;
        this.numberOfSeats=numberOfSeats;
    }

    public int getNumberOfWheel() {
        return numberOfWheel;
    }

    public void setNumberOfWheel(int numberOfWheel) {
        this.numberOfWheel = numberOfWheel;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String toString(){
        return String.format("Four Wheel Vehicle:%n%s  %nSpasifications:%nNumber of Wheel: %d%nNumber of Seets:%d%n",super.toString(),getNumberOfWheel(),getNumberOfSeats());
    }
}
