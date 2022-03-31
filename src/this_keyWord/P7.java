//Passing this as an Argument
package this_keyWord;

public class P7 {
    public int x,y;
    P7(int a,int b){
        x=a;
        y=b;
        System.out.println("Before calling this()");
        System.out.println("x: "+x+"   y: "+y);

        add(this);
        System.out.println("After calling this()");
        System.out.println("x: "+x+"   y: "+y);

    }
    public void add(P7 obj){
        obj.x +=2;
        obj.y +=2;
    }
}
