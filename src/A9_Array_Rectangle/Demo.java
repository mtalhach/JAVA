package A9_Array_Rectangle;

public class Demo {
    public static void main(String[] args) {
        Main[] list=new Main[5];
        for (int i=0;i< list.length;i++){
            list[i]=new Main(9,7);
        }
        Main.display(list);
        System.out.println("===============");

        Main[] list1=new Main[5];
        Main.copyArray(list,list1);
        Main.display(list1);
        System.out.println("===============");

        list1[2].setLength(10);
        list1[2].setWidth(20);
        Main.display(list1);
        System.out.println("===============");

        Main[] list2=Main.getArray(list);
        Main.display(list2);
        System.out.println("===============");


    }
}
