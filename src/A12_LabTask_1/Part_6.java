/*Get applicant age, marks in math, english and science from user. Write a program to find the
eligibility of admission for a professional course based on the following criteria:
To be eligible for admission, following conditions must be met:
Age must be greater than 15
Marks in math should be greater or equals to 65
Marks in english should be greaer or equals to 55
Marks in science must be greater than 50
Your programs shall print "Eligible for admission" or "Not eligible for admission", depending
on data given by user.
 */

package A12_LabTask_1;

import java.util.Scanner;

public class Part_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Age of Student");
        int age=sc.nextInt();
        System.out.println("Enter The Math marks of Student");
        int math=sc.nextInt();
        System.out.println("Enter The English Marks of Student");
        int eng=sc.nextInt();
        System.out.println("Enter The Science Marks of Student");
        int science=sc.nextInt();

        if(age>=15&&math>=65&&eng>=55&&science>=50){
            System.out.println("You Should Be eligible for Admission ");
        }
        else {
            System.out.println("You Should not eligible for admission");
        }
    }

}
