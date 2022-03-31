//Real usage of this() constructor call
package this_keyWord;

public class P4 {
    int age;
    String name,course;
    float fee;
    P4(int age,String name,String course){
        this.age=age;
        this.name=name;
        this.course=course;
    }

    P4(int age,String name,String course,float fee){
        this(age, name, course);    //reuse constructor
        this.fee=fee;
    }

    public void display(){
        System.out.println("Age: "+age+"   Name: "+name+"  course: "+course+"  fee: "+fee);
    }
}
