// Join Two Java Strings
package string_in_java;

public class P2 {
    public static void main(String[] args) {
        String first="Java ";
        String second="Programming";

        System.out.println("First String is: "+first);
        System.out.println("Second String is: "+second);

        String joinedString=first.concat(second);
        System.out.println("Joined String is: "+joinedString);
    }
}
