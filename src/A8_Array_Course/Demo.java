package A8_Array_Course;

public class Demo {
    public static void main(String[] args) {
        Main[] courseList=new Main[5];
        courseList[0]=new Main("Multi Variable Calculus","MTH123",3,"Dr Sana");
        courseList[1]=new Main("OOP","CSC241",4,"Shahid");
        courseList[2]=new Main("Discrete Structure","CSC102",3,"Mehwish Waqas");
        courseList[3]=new Main("Islamiat","HUM11",3,"Musferah");
        courseList[4]=new Main("Digital Logic and Design","EEE11",3,"Mohsin");

        System.out.println("Length Of Array is: "+courseList.length);
        System.out.println("===========================");
        for (Main temp:courseList)
            temp.display();
        System.out.println("===========================");
        for (int i=0;i<courseList.length;i++){
            courseList[i].display();
            System.out.println();
        }
        System.out.println("===========================");
        for (Main temp:courseList)
            System.out.println(temp.getDisplayString());
        System.out.println("===========================");
        for (int i=0;i<courseList.length;i++) {
            System.out.println(courseList[i].getDisplayString());
        }
        System.out.println("===========================");

        System.out.println(courseList[1].getName());
        System.out.println("=========================");
        courseList[0].setName("MVC");
        System.out.println(courseList[0].getName());
        System.out.println("=========================");

        System.out.println(courseList[1].getDisplayString());

    }
}
