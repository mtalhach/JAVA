package A36_OOP_Lab_Exam;

public class Professor extends Faculty{
    int year;
    int experience;
    int salary;

    public Professor(int year) {
        this.year = year;
    }


    @Override
    public void calculateSalary(){
        experience=year;
        salary=experience*15000;
        System.out.println("Salary is: "+salary);
    }


    }

