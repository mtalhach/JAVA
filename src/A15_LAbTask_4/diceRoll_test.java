package A15_LAbTask_4;

import java.util.Scanner;

public class diceRoll_test {
    public diceRoll_test() {
    }

    public static void main(String[] args) {
        diceRoll diceRoll = new diceRoll();
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Time To Roll");
        diceRoll.Roll(sc.nextInt());
        diceRoll.displayRolls();
    }
}
