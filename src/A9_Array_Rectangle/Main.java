package A9_Array_Rectangle;

public class Main {
    private double length;
    private double width;

    public Main(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public static void display(Main[] list){
        for (Main rec:list)
            System.out.println("Length: "+rec.getLength() +"    Width: "+rec.getWidth());
    }

    public static void copyArray(Main[] list,Main[] list1){
        for (int i=0;i< list.length;i++)
            list1[i]=list[i];
    }
    public static Main[] getArray(Main[] list){
        Main[] temp=new Main[list.length];
        for (int i=0;i<temp.length;i++)
            temp[i]=new Main(list[i].getLength(),list[i].getWidth());
        return temp;
    }
}
