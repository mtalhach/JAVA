package A36_OOP_Lab_Exam;

public class Test {
    public static void main(String[] args) {

        ResearchAssociate researchAssociate=new ResearchAssociate(12);
        ResearchAssociate researchAssociate1=new ResearchAssociate(8);

        Professor professor=new Professor(10);
        Professor professor1=new Professor(8);
        Professor professor2=new Professor(5);

        int arr[]=new int[2];

        System.out.println();
        System.out.println("==========================");
        System.out.println("Salary of Research Associate is: ");
        researchAssociate.calculateSalary();
        researchAssociate1.calculateSalary();
        System.out.println("==========================");
        System.out.println();
        System.out.println("Salary of professor  is: ");
        professor.calculateSalary();
        professor1.calculateSalary();
        professor2.calculateSalary();
    }
}
