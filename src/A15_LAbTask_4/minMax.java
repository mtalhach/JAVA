package A15_LAbTask_4;

import java.util.Scanner;

public class minMax {
    public int[] arr;
    Scanner sc;

    public minMax() {
        this.sc = new Scanner(System.in);
    }

    public void Array() {
        System.out.print("Enter The Size Of Array: ");
        int sizeOfArray = this.sc.nextInt();
        this.arr = new int[sizeOfArray];

        int j;
        for(j = 0; j < this.arr.length; ++j) {
            System.out.print("Enter The Value of index " + j + ": ");
            this.arr[j] = this.sc.nextInt();
        }

        for(j = 0; j < this.arr.length; ++j) {
            System.out.println("The Value of Index: " + j + " is: " + this.arr[j]);
        }

    }

    public void min() {
        int min = this.arr[0];

        for(int i = 1; i < this.arr.length; ++i) {
            if (min > this.arr[i]) {
                min = this.arr[i];
            }
        }

        System.out.println("Min Term is: " + min);
    }

    public void max() {
        int max = this.arr[0];

        for(int i = 1; i < this.arr.length; ++i) {
            if (max < this.arr[i]) {
                max = this.arr[i];
            }
        }

        System.out.println("Min Term is: " + max);
    }
}

