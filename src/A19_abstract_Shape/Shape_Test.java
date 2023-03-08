package A19_abstract_Shape;

public class Shape_Test {
    public static void main(String[] args) {
        /*Shape shape=new Rectangle(9,7);
        System.out.println("Rectangle: "+shape.calculateArea());

        Rectangle r1=(Rectangle)shape;    //type casting
        System.out.println(r1.getLength());*/



        Rectangle r1=new Rectangle(6,2);
        Shape s1=new Rectangle(1,9);
        Circle c1=new Circle(7);
        Circle c2=new Circle(9);
        printInfo(r1,s1,c1,c2);

    }
    public static void printInfo(Shape... shapes){
        int rectangleCounter=0;
        int circleCounter=0;
        for (Shape shape:shapes){
            if(shape instanceof Rectangle){
                rectangleCounter++;
            }
            else if (shape instanceof Circle){
                circleCounter++;
            }
        }
        System.out.println("Rectangle Counter: "+rectangleCounter);
        System.out.println("Circe Counter: "+circleCounter);
    }
}
