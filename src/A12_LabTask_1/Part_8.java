/*Get the basic salary of employee from user input, write a program that shall calculate gross
salary using given details:
for basic salary below 10000, house rent allowance is 50% and medical allowance is 10%
when Basic Salary is above 20000, HRA = 70% and MA = 20%*/

package A12_LabTask_1;
import java.util.Scanner;

public class Part_8 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter a salary: ");
        double salary = inp.nextDouble();
        double rentAllowance;
        double medAllowance;
        double grossSalary=0;
        if(salary < 10000){
            rentAllowance = salary * 0.5;
            medAllowance = salary * 0.1;
            grossSalary = salary + rentAllowance + medAllowance;
        }
        else if(salary>=10000&&salary<=20000){
            rentAllowance = salary * 0.6;
            medAllowance = salary * 0.15;
            grossSalary = salary + rentAllowance + medAllowance;
        }
        else if(salary > 20000){
            rentAllowance = salary * 0.70;
            medAllowance = salary * 0.20;
            grossSalary = salary + rentAllowance + medAllowance;
        }
        else
        {
            System.out.println("Invalid salary : ");
        }
        System.out.println("The gross salary of employee is:  " + grossSalary);
    }

}

