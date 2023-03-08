package A18_Inheritence_Vehicle;

public class Vehicle{
    private String registrationNo;
    private String ChassisNo;
    private String maker;
    private String color;

    public Vehicle(String registrationNo,String ChassisNo,String maker,String color){
        this.registrationNo=registrationNo;
        this.ChassisNo=ChassisNo;
        this.maker=maker;
        this.color=color;
    }
    public String getRegistrationNo(){
        return registrationNo;
    }
    public void setRegistrationNo(String registrationNo){
        this.registrationNo=registrationNo;
    }

    public String getChassisNo() {
        return ChassisNo;
    }

    public void setChassisNo(String chassisNo) {
        ChassisNo = chassisNo;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return String.format("Registration No: %s%nChassis No: %s%nMaker: %s%nColor: %s%n",getRegistrationNo(),getChassisNo(),getMaker(),getColor());
    }
}
