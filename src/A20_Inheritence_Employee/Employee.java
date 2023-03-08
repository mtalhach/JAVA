package A20_Inheritence_Employee;

public class Employee {
    private String fName;
    private String lName;
    private int id;
    private String ssn;

    public Employee(String fName, String lName, int id, String ssn) {
        this.fName = fName;
        this.lName = lName;
        this.id = id;
        this.ssn = ssn;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString(){
        return String.format("Name: %s %s%nEmployee ID: %d%nSocial Security Number: %s%n",getfName(),getlName(),getId(),getSsn());
    }
}
