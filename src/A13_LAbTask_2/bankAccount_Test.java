package A13_LAbTask_2;

import java.util.Scanner;

public class bankAccount_Test {
    public bankAccount_Test() {
    }

    public static void main(String[] args) {
        bankAccount Account = new bankAccount();
        Scanner sc = new Scanner(System.in);

        int select;
        do {
            System.out.println("Press 1: To Deposit an amount");
            System.out.println("Press 2: To Withdraw an amount");
            System.out.println("Press 3: To View the current balance");
            System.out.println("Press 4: To Show The Account");
            System.out.println("Press 5: To Close this program");
            select = sc.nextInt();
            if (select == 1) {
                Account.deposit();
            }

            if (select == 2) {
                Account.withDraw();
            }

            if (select == 3) {
                Account.currentBalance();
            }

            if (select == 4) {
                Account.showAccount();
            }
        } while(select != 5);

        System.out.println("Thank you");
    }
}
