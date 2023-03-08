/*Calculate total salary based on commission and bonus. Get sale amount from user input.
Assume, 2% commission when sales is less than or equals to 100,000. 1.5% commission if sales
above 100,000 and below 300,000 with additional bonus of 2000. 1% if sales above
25,000 (which is minimum salary of employee and always paid, irrespective of sales)?*/

package A12_LabTask_1;
import java.util.Scanner;

public class Part_9 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter a sales: ");
        double sales = inp.nextDouble();
        double commission;
        int bonus;
        int salary = 25000;
        double grossSalary = 0;
        if(sales <=100000){
            commission = sales * 0.02;
            grossSalary = commission + salary;
        }
        else if(sales >100000 && sales <=300000){
            commission = sales * 0.015;
            bonus = 2000;
            grossSalary = salary + commission + bonus;
        }
        else if(sales > 300000){
            commission = sales * 0.01;
            bonus = 3000;
            grossSalary = salary + commission + bonus;
        }
        System.out.println("The gross salary of employee is " + grossSalary);
    }
}
