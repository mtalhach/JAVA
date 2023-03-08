package A20_Inheritence_Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee=new SalariedEmployee("Ali","Ahmad",101,"E105A",25000);
        HourlyEmployee hourlyEmployee=new HourlyEmployee("Tahir","Muhammad",102,"E109A",8000);
        CommissionEmployee commissionEmployee=new CommissionEmployee("Faisla","Abid",105,"E001A",35000);
        BaseCommissionEmp baseCommissionEmp=new BaseCommissionEmp("Talha","Shafiq",786,"E059A",50000);


        System.out.println("\t\t\t\tEmployee Processed Individually");
        System.out.println(salariedEmployee.toString());
        System.out.println("===========================");
        System.out.println(hourlyEmployee.toString());
        System.out.println("===========================");
        System.out.println(commissionEmployee.toString());
        System.out.println("===========================");
        System.out.println(baseCommissionEmp.toString());
        System.out.println();
        System.out.println();


     /*   System.out.println("\t\t\t\tEmployee Processed polymorphism");

        Employee[] employee=new Employee[4];
        employee[0]=salariedEmployee;
        employee[1]=hourlyEmployee;
        employee[2]=commissionEmployee;
        employee[3]=baseCommissionEmp;

        for (Employee currentEmployee:employee){
            System.out.println(currentEmployee);
        }*/
    }
}
