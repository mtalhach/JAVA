package static_keyWord;

public class P1 {
    int rollNo;
    String name;
    static String Uni="COMSATS";
    P1(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
    }
    public void display(){
        System.out.println("Roll No: "+rollNo+"\nName: "+name+"\nUni: "+Uni);
    }
}
