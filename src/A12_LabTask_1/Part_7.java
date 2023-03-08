/*Let's say, a number is 'special' if its divisible by 2, 3 but not by 7. Can you count and print
how many and which numbers are special starting from 1 to a number given by user.
Sample:
Special Number Count: 3
Following are special: 6, 12, 18
(Note: there is no objective of finding special numbers... its only to learn building logic)*/

package A12_LabTask_1;

import java.util.Scanner;

public class Part_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Ending Number");
        int num = sc.nextInt();
        int count = 0;
        int j = 0;
        int[] specialCharacter = new int[100];

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0 && i % 3 == 0){
                count++;
                specialCharacter[j] = i;
                j++;
            }
        }
        System.out.println("Special Character Counter is:"+count);

        for (int k=0;k<count;k++){
            System.out.println("The Special Character is: "+specialCharacter[k]);
        }
    }
}