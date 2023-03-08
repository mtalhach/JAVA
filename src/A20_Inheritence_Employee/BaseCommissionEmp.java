package A20_Inheritence_Employee;

public class BaseCommissionEmp extends Employee{
    private double baseSalary;
    public BaseCommissionEmp(String fName, String lName, int id, String ssn,double baseSalary)
    {
        super(fName,lName,id,ssn);
        this.baseSalary=baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    @Override
    public String toString(){
        return String.format("Base+Commission Employee:%n%s    %nBase Rate:$%,.2f",super.toString(),getBaseSalary());
    }
}
