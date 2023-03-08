package A14_LAbTask_3;

import java.util.Scanner;

public class Account {
    private int id;
    private String name;
    private double balance;
    private int age;
    Scanner sc;

    Account() {
        this.sc = new Scanner(System.in);
        System.out.print("Enter The ID of Account Holder: ");
        int id = this.sc.nextInt();
        System.out.print("Enter The Name of Holder: ");
        this.sc.nextLine();
        String name = this.sc.nextLine();
        System.out.println("Enter The Age of Holder: ");
        int age = this.sc.nextInt();
        if (age >= 20) {
            System.out.println("===================");
            System.out.println("Id: " + id);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Account Create Successfully");
            System.out.println("===================");
        }

        double balance;
        if (age > 36) {
            balance = 0.0D;
            System.out.println("Balance: " + balance);
        } else if (age >= 20 && age <= 25) {
            balance = 50000.0D;
            System.out.println("Balance: " + balance);
        } else if (age > 25 && age <= 30) {
            balance = 25000.0D;
            System.out.println("Balance: " + balance);
        } else if (age > 30 && age <= 35) {
            balance = 10000.0D;
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("\nAge below 20 not allowed to opened ana account.");
        }

    }
}

