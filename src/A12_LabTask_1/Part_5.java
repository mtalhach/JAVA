/*Write a java program that shall get two numbers from user of double type. It shall print the
remainder when first is divided by second. it shall also print ... whether first is
divisible by second or not.
Example output:
Enter first num:7
Enter second num: 2
The remainder is 1
7 is not divisible by 2*/

package A12_LabTask_1;

import java.util.Scanner;

public class Part_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number 1");
        double num1=sc.nextDouble();
        System.out.println("Enter a number 2");
        double num2=sc.nextDouble();

        int reminder= (int) (num1%num2);
        System.out.println("Reminder is: "+reminder);
        if (reminder==0)
            System.out.println("num 1 is divisible by num 2");
        else
            System.out.println("num1 is not divisible ny num 2");


    }
}
