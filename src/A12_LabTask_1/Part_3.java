/*Get an integer from user that represent a year, it must be greater than 500, if less, ask again
until valid number is entered (hint: use loop to remain asking until valid number is given, when
(A leap year is one which is evenly divided by 4. But for century years, the year must also be evenly
divided by 400. e.g. 1800 is divisible at 4, but not leap because its a century year and is not evenly
divisible at 400. So you must also check whether the user entered year is century year or not to decide
correctly)*/

package A12_LabTask_1;

import java.util.Scanner;

public class Part_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year greater then 500");
        int year=sc.nextInt();
        while (true){
            if(year<500){
                System.out.println("Invalid choice Enter a year Greater then 500");
                year=sc.nextInt();
            }
            else {
                break;
            }
        }
        if(year%4==0&&year%100==0&&year%400==0){
            System.out.println("Year is a leap year");
        }
        else {
            System.out.println("Year is not a leap year");
        }
    }
}
