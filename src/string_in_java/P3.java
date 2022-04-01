// compare two strings
package string_in_java;

public class P3 {
    public static void main(String[] args) {
        String first="Java Programming";
        String second="Java Programming";
        String third="Python Programming";

        boolean compare=first.equals(second);
        boolean compare1=first.equals(third);

        System.out.println("Compare First and Second: "+compare);
        System.out.println("Compare First And Third: "+compare1);
    }
}

