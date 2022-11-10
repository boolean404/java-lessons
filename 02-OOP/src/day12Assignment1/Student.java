package day12Assignment1;

public class Student {
	// declare field
	private int studentId;
	private String name;
	private int mark;

	// getter
	public int getStudentId() { 
		return studentId;
	}

	public String getName() {
		return name;
	}

	public int getMark() {
		return mark;
	}

	// setter
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setmark(int mark) {
		this.mark = mark;
	}

	// constructor
	public Student(int studentId, String name, int mark) {
		this.studentId = studentId;
		this.name = name;
		this.mark = mark;
	}

	public void display() {
		System.out.println("ID is : " + studentId);
		System.out.println("Name is : " + name);
		System.out.println("Mark is : " + mark);
	}
}
