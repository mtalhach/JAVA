package A4_Date;

public class Main {
    private int day;
    public int month;
    private int year;

    public Main(int d,int m,int y){
        setDay(d);
        setMonth(m);
        setYear(y);
    }
    public void setDay(int d){
        if (d>0&&d<=31)
            day=d;
    }

    public int getDay() {
        return day;
    }
    public void setMonth(int m){
        if (m>0&&m<=12)
            month=m;
    }
    public int getMonth(){
        return month;
    }
    public void setYear(int y){
        if(y>1949)
            year=y;
    }
    public int getYear(){
        return year;
    }


    public void displayDate(){
        System.out.printf("%d/%d/%d",day,month,year);
    }
}
