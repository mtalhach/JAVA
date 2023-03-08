package A17_Aggregation_Institutes;

public class Student {
    public String name;
    public int id;
    public String Dept;

    public Student(String name, int id, String dept) {
        this.name = name;
        this.id = id;
        Dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }


}
