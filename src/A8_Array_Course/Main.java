package A8_Array_Course;

public class Main {
    private String name;
    private String code;
    private int creditHours;
    private String instructor;

    public Main(String name, String code, int creditHours, String instructor) {
        this.name = name;
        this.code = code;
        this.creditHours = creditHours;
        this.instructor = instructor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void display(){
        System.out.printf("Course Name: %-12s%n",name);
        System.out.printf("Course Code: %-12s%n",code);
        System.out.printf("CreditHours: %d%n",creditHours);
        System.out.printf("Instructor: %-12s%n",instructor);
    }

    public String getDisplayString(){
        return String.format("  Course Name:%-12s%n  Course Code:%-12s%n  CreditHours:%d%n  Instructor:%-12s%n",name,code,creditHours,instructor);
    }
}
