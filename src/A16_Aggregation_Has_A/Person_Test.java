package A16_Aggregation_Has_A;

public class Person_Test {
    public Person_Test() {
    }

    public static void main(String[] args) {
        Person[] list =new Person[5];
        Address address=new Address("Street 1", "Lahore", "Pakistan", 54000);
        Date date=new Date(1, 2, 2000);
        list[0]=new Person("Muhammad", "Shahid", 101,address,date);
        list[1]=new Person("Muhammad", "Shahid", 101, address,date);
        list[2]=new Person("Muhammad", "Shahid", 101, address,date);
        list[3]=new Person("Muhammad", "Shahid", 101, address,date);
        list[4]=new Person("Muhammad", "Shahid", 101, address,date);

        displayPerson(list);
        System.out.println("================");
        list[0].getAddress().setCity("Islamabad");
        displayPerson(list);
    }

    public static void displayPerson(Person[] list) {
        for (Person temp:list)
            System.out.println(temp);
    }

}
