//Using this in Constructor Overloading
package this_keyWord;

public class P6 {
    public int a,b;
    P6(int i,int j){
        a=i;
        b=j;
    }
    P6(int i){
        this(i,i);
    }
    P6(){
        this(0);
    }
    @Override
    public String toString(){
        return this.a+" + "+this.b+" i";
    }
}
