package A16_Aggregation_Has_A;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public void setDay(int day) {
        if (day > 0 && day <= 31) {
            this.day = day;
        }

    }

    public void setMonth(int month) {
        if (month > 0 && month <= 12) {
            this.month = month;
        }

    }

    public void setYear(int year) {
        if (year > 1949) {
            this.year = year;
        }

    }

    public String toString() {
        return String.format("%d/%d/%d", this.getDay(), this.getMonth(), this.getYear());
    }
}

