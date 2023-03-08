package A16_Aggregation_Has_A;

public class Person {
    private String fName;
    private String lName;
    private int id;
    private Address address;
    private Date dateOfBirth;

    public Person(String fName, String lName, int id, Address address, Date dateOfBirth) {
        this.fName = fName;
        this.lName = lName;
        this.id = id;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    public String getfName() {
        return this.fName;
    }

    public String getlName() {
        return this.lName;
    }

    public int getId() {
        return this.id;
    }

    public Address getAddress() {
        return this.address;
    }

    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String toString() {
        return String.format("Name: %s %s%nId: %d%nAddress: %s%nDate: %s", this.getfName(), this.getlName(), this.getId(), this.getAddress(), this.getDateOfBirth());
    }
}

