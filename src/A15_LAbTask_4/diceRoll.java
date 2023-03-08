package A15_LAbTask_4;

import java.security.SecureRandom;

public class diceRoll {
    public int one = 0;
    public int two = 0;
    public int three = 0;
    public int four = 0;
    public int five = 0;
    public int six = 0;
    SecureRandom random = new SecureRandom();
    int[] dice = {1, 2, 3, 4, 5, 6};

    public void Roll(int n) {
        for(int i = 0; i < n; ++i) {
            int temp = this.dice[this.random.nextInt(6)];
            if (temp == 1) {
                ++this.one;
            }

            if (temp == 2) {
                ++this.two;
            }

            if (temp == 3) {
                ++this.three;
            }

            if (temp == 4) {
                ++this.four;
            }

            if (temp == 5) {
                ++this.five;
            }

            if (temp == 6) {
                ++this.six;
            }
        }

    }

    public void displayRolls() {
        System.out.printf("Number 1 was rolled %d times.%n", this.one);
        System.out.printf("Number 2 was rolled %d times.%n", this.two);
        System.out.printf("Number 3 was rolled %d times.%n", this.three);
        System.out.printf("Number 4 was rolled %d times.%n", this.four);
        System.out.printf("Number 5 was rolled %d times.%n", this.five);
        System.out.printf("Number 6 was rolled %d times.%n", this.six);
    }
}

