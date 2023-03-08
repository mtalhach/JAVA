package A12_LabTask_1;

import java.util.Scanner;

public class Part_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number till find Prime Number");
        int num=sc.nextInt();
        System.out.println(num);
        int flag=1;
        for (int i=2;i<num;i++){
            for (int j=2;j<=i/2;j++){
                if (i%j==0){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                System.out.println("The Prime Number is: "+i);
            }
        }
    }
}
