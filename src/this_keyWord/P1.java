//this: to refer current class instance variable

package this_keyWord;

public class P1 {
    int rollNo;
    String name;
    float fee;
//    P1(int rollNo,String name,float fee){  //constructor
//        rollNo=rollNo;
//        name=name;
//        fee=fee;
//    }



//        P1(int rollNo,String name,float fee){  //constructor
//        this.rollNo=rollNo;
//        this.name=name;
//        this.fee=fee;
//    }



        P1(int r,String n,float f){  //constructor
        rollNo=r;
        name=n;
        fee=f;
    }

}

