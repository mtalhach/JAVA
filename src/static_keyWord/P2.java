package static_keyWord;

public class P2 {
    int rollNo;
    String name;
    static String Uni="COMSATS";
    P2(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
    }
    public static void change(){
        Uni="LUMS";
    }
    public void display(){
        System.out.println("Roll No: "+rollNo+"\nName: "+name+"\nUni: "+Uni);
    }
}
