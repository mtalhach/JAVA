package A12_LabTask_1;
//Get a 4 digit integer number from user input and print each digit on a separate line.

import java.util.Scanner;

public class Part_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Digit");
        int number=sc.nextInt();
        int reminder;
        while (number>0){
           reminder=number%10;
           number=number/10;
           System.out.println(reminder);
        }
    }

}
