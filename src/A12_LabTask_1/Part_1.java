/*Declare and initialize byte, short, int, float, long, double, boolean
type variables using literals, change those values by user input and then print all of
7 variables on console. (in lab video, you have already seen, how to get
input from user using Scanner class)*/

package A12_LabTask_1;

import java.util.Scanner;

public class Part_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value for Byte");
        byte b=sc.nextByte();
        System.out.println("Enter Value for Short");
        short s=sc.nextShort();
        System.out.println("Enter Value for int");
        int i=sc.nextInt();
        System.out.println("Enter Value for float");
        float f=sc.nextFloat();
        System.out.println("Enter Value for long");
        long l=sc.nextLong();
        System.out.println("Enter Value for Double");
        double d=sc.nextDouble();
        System.out.println("Enter Value for Boolean");
        boolean bol=sc.nextBoolean();

        Part_1 obj=new Part_1();
        obj.display(b,s,i,f,l,d,bol);
    }
    public void display(byte b,short s,int i,float f,long l,double d,Boolean bol){
        System.out.println("The value of Byte is: "+b);
        System.out.println("The value of Short is: "+s);
        System.out.println("The value of int is: "+i);
        System.out.println("The value of float is: "+f);
        System.out.println("The value of long is: "+l);
        System.out.println("The value of Double is: "+d);
        System.out.println("The value of Boolean is: "+bol);
    }



}
