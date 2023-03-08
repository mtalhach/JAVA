package A21_Inheritence_Extends_PersonClass;

import A16_Aggregation_Has_A.Address;
import A16_Aggregation_Has_A.Date;

public class Demo {
    public Demo() {
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Muhammad", "Ali", 101, new Address("E212", "Lahore", "Pakistan", 111), new Date(12, 11, 2021), "Legal", 2000.0D);
        System.out.println(employee.toString());
    }
}
