package A20_Inheritence_Employee;

public class HourlyEmployee extends Employee{
    private double hours;
    public HourlyEmployee(String fName, String lName, int id, String ssn,double hours)
    {
        super(fName,lName,id,ssn);
        this.hours=hours;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    @Override
    public String toString(){
        return String.format("Hourly Employee:%n%s     %nHourly Work:$%,.2f",super.toString(),getHours());
    }
}
