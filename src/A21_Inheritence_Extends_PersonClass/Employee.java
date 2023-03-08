package A21_Inheritence_Extends_PersonClass;

import A16_Aggregation_Has_A.Address;
import A16_Aggregation_Has_A.Date;
import A16_Aggregation_Has_A.Person;

public class Employee extends Person {
    private String ssn;
    public double salary;

    public Employee(String fName, String lName, int id, Address address, Date dateOfBirth, String ssn, double salary) {
        super(fName, lName, id, address, dateOfBirth);
        this.ssn = ssn;
        this.salary = salary;
    }

    public String getSsn() {
        return this.ssn;
    }

    public double getSalary() {
        return this.salary;
    }

    public String toString() {
        return String.format("Employee: %s%nssn: %s%nSalary: %.2f%n", super.toString(), this.getSsn(), this.getSalary());
    }
}
