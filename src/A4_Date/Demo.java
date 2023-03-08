package A4_Date;

public class Demo {
    public static void main(String[] args) {
        Main obj=new Main(9,3,2001);
        obj.displayDate();
        System.out.println();
        obj.setDay(2);
        obj.setMonth(8);
        obj.setYear(2002);
        obj.displayDate();
        System.out.println();

        Main obj1=new Main(9,-22,2003);
        System.out.println(obj1.getDay());
        System.out.println(obj1.getMonth());
        System.out.println(obj1.getYear());
    }
}
