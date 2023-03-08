package A11_2D_Array_GradingSystem;

public class GradeBook {
    private String CourseName;
    private int[][] grade;

    public GradeBook(String courseName, int[][] grade) {
        CourseName = courseName;
        this.grade = grade;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public void processGrade(){
        outputGrade();
        System.out.printf("%n%s %d%n%s %d %n%n","The Minimum Grade of Subject is:",getMinimum(),
                "The Maximum Grade of Subject is:",getMaximum());

        outputBarChart();
    }

    public int getMinimum(){
        int lowGrade=grade[0][0];
        for (int[] StudentGrades:grade)
        {
            for (int grades:StudentGrades)
            {
                if(grades<lowGrade)
                    lowGrade=grades;
            }
        }
        return lowGrade;
    }

    public int getMaximum(){
        int maxGrade=grade[0][0];
        for (int[] StudentGrades:grade)
        {
            for (int grades:StudentGrades)
            {
                if(grades>maxGrade)
                    maxGrade=grades;
            }
        }
        return maxGrade;
    }

    public double average(int[] setOfGrades){
        int total=0;
        for (int grades:setOfGrades)
            total=total+grades;

        return (double)total/setOfGrades.length;
    }

    public void outputBarChart(){
        System.out.println("OverAll Grade Distribution");
        int[] frequency=new int[11];
        for (int[] setOfGrades:grade) {
            for (int grades : setOfGrades)
                ++frequency[grades / 10];
        }

            for (int count=0;count<frequency.length;count++){
                if(count==10)
                    System.out.printf("%5d",100);
                else
                    System.out.printf("%02d-%02d:",count*10,count*10+9);

                for (int star=0;star<frequency[count];star++)
                    System.out.print("*");
                System.out.println();
            }
        }

        public void outputGrade(){
        System.out.printf("%n%nThe Grades Are: %n");
        System.out.print("               ");

        for (int test=0;test<grade[0].length;test++)
            System.out.printf("Test %d  ",test+1);
        System.out.println("Average");


        for (int Student=0;Student<grade.length;Student++)
        {
            System.out.printf("Student %2d",Student+1);
            for (int Marks:grade[Student])
                System.out.printf("%8d",Marks);

            System.out.printf("%9.2f%n",average(grade[Student]));
        }
    }
}
