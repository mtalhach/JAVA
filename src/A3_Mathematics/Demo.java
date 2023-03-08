package A3_Mathematics;

public class Demo {
    public static void main(String[] args) {
        Main math=new Main();

        System.out.println("Addition:");
        int sum1=math.add(5,5);
        double sum2=math.add(7.0,7.0);
        double sum3=math.add(5,7.0);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println("=============");

        System.out.println("Multiplication:");
        System.out.println(math.multiply(2,3));
        System.out.println(math.multiply(3.7,4.5));
        System.out.println(math.multiply(9,8.5));
        System.out.println("=============");

        System.out.println("Min Term:");
        System.out.println(math.min(7,5));
        System.out.println(math.min(8,9,11));
        System.out.println(math.min(4,6,7,8));
    }
}
