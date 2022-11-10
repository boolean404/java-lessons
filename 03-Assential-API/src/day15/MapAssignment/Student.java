package day15.MapAssignment;

public class Student {
    // private int rollNum;
    private String name;


    public Student(String name) {
        // this.rollNum = rollNum;
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

    // public int getRollNum() {
    //     return rollNum;
    // }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public void insertStudent(int rollNum, String name) {
        this.rollNum = rollNum;
        this.name = name;
    }

}
