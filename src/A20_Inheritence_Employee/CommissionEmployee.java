package A20_Inheritence_Employee;

public class CommissionEmployee extends Employee{
    private double commission;
    public CommissionEmployee(String fName, String lName, int id, String ssn,double commission)
    {
        super(fName,lName,id,ssn);
        this.commission=commission;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
    @Override
    public String toString(){
        return String.format("Commission Employee:%n%s      %nCommission Rate:$%,.2f",super.toString(),getCommission());
    }
}
