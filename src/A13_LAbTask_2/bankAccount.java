package A13_LAbTask_2;

import java.util.Scanner;

public class bankAccount {
    private String HolderName;
    private double balance;
    public double bonus;
    public double reduce;
    public double amount;
    public int depositCounter;
    public int withDrawCounter;
    Scanner sc;

    bankAccount() {
        this.sc = new Scanner(System.in);
        System.out.println("Holder Name: ");
        this.HolderName = this.sc.nextLine();
        System.out.println("Account Holder Name is: " + this.HolderName);
        this.balance = 5000.0;
        System.out.println("Balance is: " + this.balance);
        System.out.println("====================================");
    }

    public void deposit() {
        System.out.println("Enter The Amount You Want to Deposit:");
        this.amount = (double)this.sc.nextInt();
        if (this.amount > 100000.0D) {
            this.bonus = this.amount * 0.02D;
            this.amount += this.bonus;
            this.balance += this.amount;
            System.out.println("Balance After 2% Additional Bonus: " + this.balance);
        } else {
            this.balance += this.amount;
            System.out.println("Balance After Deposit is: " + this.balance);
        }

        ++this.depositCounter;
    }

    public void withDraw() {
        System.out.println("Enter The Amount You Want to withdraw:");
        this.amount = (double)this.sc.nextInt();
        if (this.amount > this.balance) {
            System.out.println("Invalid Amount. Enter Amount between current Balance....Try Again");
        } else if (this.amount < 50000.0D) {
            System.out.println("Are you sure you want to withdraw.");
            System.out.println("Available balance is " + this.balance + " PKR");
            System.out.println("Press 1 for continue and 0 for exit.");
            int ch = this.sc.nextInt();
            if (ch == 1) {
                this.reduce = this.amount * 0.05D;
                this.amount -= this.reduce;
                this.balance -= this.amount;
                System.out.println("The Balance After 5% reduction: " + this.balance);
            }
        } else {
            this.balance -= this.amount;
            System.out.println("The Balance is: " + this.balance);
        }

    }

    public void currentBalance() {
        System.out.println("Current Balance is: " + this.balance);
    }

    public void showAccount() {
        System.out.println("Holder Name: " + this.HolderName);
        System.out.println("Balance: " + this.balance);
        System.out.println("Total Deposit: " + this.depositCounter);
        System.out.println("Total WithDraw: " + this.withDrawCounter);
    }
}
