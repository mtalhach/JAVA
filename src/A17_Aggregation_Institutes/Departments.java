package A17_Aggregation_Institutes;

import java.util.List;

public class Departments {
    private String deptName;
    private List<Student> students;

    public Departments(String deptName,List<Student> students){
        this.students=students;
        this.deptName=deptName;
    }

    public List<Student> getStudents(){
        return students;
    }
}
