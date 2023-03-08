package A1_OOP_Class_1;

import java.util.Random;
import java.util.Scanner;

public class P6 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 0 for Oppo, 1 for Vivo, 2 for Samsung");
        int UserInput=sc.nextInt();

        Random random=new Random();
        int CompInput=random.nextInt(3);

        if (UserInput==CompInput){
            System.out.println("Draw..........");
        }
        else if (UserInput==0&&CompInput==2||UserInput==1&&CompInput==0||UserInput==2
        &&CompInput==1){
            System.out.println("User Win");
        }
        else{
            System.out.println("Computer Win");
        }

        System.out.println("Computer Choice: "+CompInput);
        if (CompInput==0){
            System.out.println("Computer Choice is Oppo");
        }
        if (CompInput==1) {
            System.out.println("Computer Choice is Vivo");
        }
        if (CompInput==2) {
            System.out.println("Computer Choice is Samsung");
        }
    }

}
