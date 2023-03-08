/*Get an integer for table number, start value and end value. all integer. your program should print a
table... from start to end value. For example, here is sample run:
Enter table #: 3
Enter start #: 7
Enter end #: 9
3 x 7 = 21
3 x 8 = 24
3 x 9 = 27*/

package A12_LabTask_1;
import java.util.Scanner;

public class Part_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int num=sc.nextInt();
        System.out.println("Enter The Starting Value of Number");
        int start=sc.nextInt();
        System.out.println("Enter The Ending Value of Number");
        int end=sc.nextInt();

        for (int i=start;i<=end;i++)
            System.out.println(num +"X"+ i +"=" +i*num);
    }
}
