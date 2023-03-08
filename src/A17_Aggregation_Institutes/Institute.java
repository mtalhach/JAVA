package A17_Aggregation_Institutes;

import java.util.List;

public class Institute {
    private String instituteName;
    public List<Departments> departments;

    public Institute(String instituteName, List<Departments> departments) {
        this.instituteName = instituteName;
        this.departments = departments;
    }

    public int getTotalStudentsInInstitute(){
        int noOfStudents=0;
        List<Student> students;

        for (Departments dept:departments){
            students=dept.getStudents();

            for (Student s:students){
                noOfStudents++;
            }
        }
        return  noOfStudents;
    }
}