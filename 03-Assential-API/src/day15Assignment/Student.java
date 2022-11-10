package day15Assignment;

public class Student {
    private int rollNum;
    private String name;

    public Student(int rollNum, String name) {
        this.rollNum = rollNum;
        this.name = name;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

}
