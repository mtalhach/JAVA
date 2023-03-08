package A27_Assignment;

import java.util.Arrays;

public class Movie1 {
    private int id;
    private String title;
    private String[] actor;
    private String category;
    private int year;
    private int length;

    public Movie1(int id, String title, String[] actor, String category, int year, int length) {
        this.id = id;
        this.title = title;
        this.actor = actor;
        this.category = category;
        this.year = year;
        this.length = length;
    }

    public Movie1() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getActor() {
        return actor;
    }

    public void setActor(String[] actor) {
        this.actor = actor;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String toString() {
        return String.format("ID: %d\nTitle: %s\nActors: %s\nCategory: %s\nYear: %d\nLength: %d minutes", getId(), getTitle(), Arrays.toString(getActor()), getCategory(),getYear(),getLength());
    }
}
