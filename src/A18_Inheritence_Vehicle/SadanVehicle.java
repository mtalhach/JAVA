package A18_Inheritence_Vehicle;

public class SadanVehicle extends FourWheelVehicle{
    private int bootSpace;

    public SadanVehicle(String registrationNo,String ChassisNo,String maker,String color,int numberOfWheel,int numberOfSeats,int bootSpace){
        super(registrationNo,ChassisNo,maker,color,numberOfWheel,numberOfSeats);
        this.bootSpace=bootSpace;
    }

    public int getBootSpace() {
        return bootSpace;
    }

    public void setBootSpace(int bootSpace) {
        this.bootSpace = bootSpace;
    }
    public String toString(){
        return String.format("Sadan Vehicle:%n%s  %nSpasifications:%nBoot Soace: %d%n",super.toString(),getBootSpace());
    }
}
