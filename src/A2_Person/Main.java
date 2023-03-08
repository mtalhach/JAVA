package A2_Person;

public class Main {
    public static void main(String[] args) {
        Demo person = new Demo();
        person.displayPerson();
        System.out.println();
        Demo person1 = new Demo("Ali", 21, 5.7D, 34000.0D);
        person1.displayPerson();
        System.out.println();
        person.earn(7000);
        person.used(4000);
        person.displayPerson();
        System.out.println();
        person.setName("Ahmad");
        person.displayPerson();
        System.out.println();
        System.out.println(person.getName());
    }
}
