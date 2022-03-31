//this: to pass as an argument in the method
package this_keyWord;

public class P5 {
    public void m(P5 obj){
        System.out.println("System is Invoked");
    }
    public void n(){
        m(this);
    }
}
