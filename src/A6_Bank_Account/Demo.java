package A6_Bank_Account;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Main account=new Main();
        Scanner sc=new Scanner(System.in);
        System.out.println("Plz Enter Your Name: ");
        String name=sc.nextLine();

        int count=0,count1=0;
        System.out.println("Press 1: To Deposit an amount");
        System.out.println("Press 2: To Withdraw an amount");
        System.out.println("Press 3: To View the current balance");
        System.out.println("Press 4: To Close this program");
        System.out.println("Press 5: To show the history of the client");

        boolean i=true;
        while (i){
            int select=sc.nextInt();
            if (select==1){
                System.out.println("Enter The Amount You Want To deposit:");
                int a=sc.nextInt();
                account.deposit(a);
                count++;
            }
            if (select==2){
                System.out.println("Enter The Amount You Want To Withdraw:");
                int b=sc.nextInt();
                account.withdraw(b);
                count1++;
            }
            if (select==3){
                System.out.println("Your Current Balance is:"+account.balance);
            }
            if (select==4){
                return;
            }
            if (select==5){
                System.out.println("Account Tittle: "+name);
                System.out.println("Balance: "+account.balance);
                System.out.println("Total deposit:" +count +"\nTotal Withdraw:"+count1);
            }

        }
    }
}

