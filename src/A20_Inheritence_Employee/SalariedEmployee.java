package A20_Inheritence_Employee;

public class SalariedEmployee extends Employee{
    private double weekly;
    public SalariedEmployee(String fName, String lName, int id, String ssn,double weekly)
    {
        super(fName,lName,id,ssn);
        this.weekly=weekly;
    }

    public double getWeekly() {
        return weekly;
    }

    public void setWeekly(double weekly) {
        this.weekly = weekly;
    }

    @Override
    public String toString(){
        return String.format("Salaried Employee:%n%s     %nWeekly Salary:$%,.2f",super.toString(),getWeekly());
    }
}
