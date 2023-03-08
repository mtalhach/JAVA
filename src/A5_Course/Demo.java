package A5_Course;

public class Demo {
    public static void main(String[] args) {
        Main courseDetails=new Main("oop","CSC101",4,"Shahid Bhatti");
        courseDetails.display();
        System.out.println();
        System.out.println("====================");

        System.out.println(courseDetails.getDisplayString());
    }

}
