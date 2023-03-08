package A2_Person;

public class Demo {
    private String Name;
    private int age;
    private double height;
    private double salary;

    public Demo() {
        this.Name = "Talha";
        this.age = 21;
        this.height = 5.7D;
        this.salary = 21000.0D;
    }

    Demo(String Name, int age, double height, double salary) {
        this.Name = Name;
        this.age = age;
        this.height = height;
        this.salary = salary;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void earn(int amount) {
        salary=salary+amount;
    }

    public void used(int amount) {
        salary=salary-amount;
    }

    public void displayPerson() {
        System.out.printf("Name: %s\tAge: %d\tHeight: %.2f\tSalary: %.2f", this.getName(), this.getAge(), this.getHeight(), this.getSalary());
    }
}
