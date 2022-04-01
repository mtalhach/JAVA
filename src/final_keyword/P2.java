//java final method
package final_keyword;

public class P2 {
    public final void display(){
        System.out.println("This is a final method");
    }
}

/*
class Main extends P2{
    // try to override final method
    public final void display(){   //display()' cannot override 'display()' in 'final_keyword.P2'; overridden method is final
        System.out.println("Try to overRide final method");
    }
}
*/
