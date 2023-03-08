package A36_OOP_Lab_Exam;

public class ResearchAssociate extends Faculty{
    int noOfHoursWorked;

    public ResearchAssociate(int noOfHoursWorked) {
        this.noOfHoursWorked = noOfHoursWorked;
    }

    @Override
    public void calculateSalary(){
        int salary=noOfHoursWorked*500;
        System.out.println("Salary is: "+salary);
    }
}
