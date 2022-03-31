//this() : to invoke current class constructor

package this_keyWord;

public class P3 {
    P3(){
        System.out.println("This is a Constructor");
    }
    P3(int x){
        this();
        System.out.println("x is: "+x);
    }
}
