package A17_Aggregation_Institutes;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Student s1=new Student("Ali",101,"CSC");
        Student s2=new Student("Ahmad",102,"CSC");
        Student s3=new Student("Faisal",103,"EEB");
        Student s4=new Student("Zain",104,"EEB");

        List<Student> CS_Students=new ArrayList<Student>();

        CS_Students.add(s1);
        CS_Students.add(s2);

        List<Student> EE_Students=new ArrayList<Student>();
        EE_Students.add(s3);
        EE_Students.add(s4);

        Departments CSE = new Departments("CSE", CS_Students);
        Departments EE = new Departments("EE", EE_Students);

        List<Departments> departments=new ArrayList<Departments>();
        departments.add(CSE);
        departments.add(EE);

        Institute institute = new Institute("BITS", departments);
        System.out.print("Total students in institute: ");

        System.out.print(institute.getTotalStudentsInInstitute());
    }
}
