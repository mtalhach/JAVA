package constructor;

public class P1_Demo {
    public static void main(String[] args) {
//        P1 obj=new P1();
        P1 obj=new P1("Talha","Ch",20);
        System.out.println("Name: "+obj.fName+" "+ obj.lName+"\nAge: "+obj.age);
    }
}
