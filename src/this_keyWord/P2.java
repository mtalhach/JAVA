//this: to invoke current class method

package this_keyWord;

public class P2 {
    public void m(){
        System.out.println("Hello m");
    }
    public void n(){
        System.out.println("Hello n");
        this.m();
    }
}
