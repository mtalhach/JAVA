package A14_LAbTask_3;

import java.time.LocalDate;
import java.util.Scanner;

public class DOB {
    private String name;
    private LocalDate dateOfBirth;
    private double height;
    private double weight;
    Scanner sc;

    DOB(String name, int year, int month, int day) {
        this.sc = new Scanner(System.in);
        this.name = name;
        this.dateOfBirth = LocalDate.now().minusYears((long)year).minusMonths((long)month).minusDays((long)day);
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Date of Birth: " + this.dateOfBirth);
    }
}
