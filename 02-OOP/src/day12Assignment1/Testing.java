package day12Assignment1;

import java.util.Scanner;

public class Testing {
	public static void main(String[] args) {
		System.out.println("------------------- Assignment 1 by Bo Bo Aung -----------------\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("How many students do you want to add : ");

		int stuQty = sc.nextInt();
		Student[] stuArr = new Student[stuQty];
		int j = 1;
		for (int i = 0; i < stuQty; i++) {

			System.out.println("\n=> Input data for student " + j);
			j++;
			System.out.print("Insert student ID :");
			int stuId = sc.nextInt();
			System.out.print("Insert student name :");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Insert student mark :");
			int mark = sc.nextInt();

			stuArr[i] = new Student(stuId, name, mark);

		}

		// start display student data section
		System.out.println("\n----------- All Students Details ------------");
		int x = 1;
		for (int i = 0; i < stuArr.length; i++) {
			System.out.println("\n=> Student " + x + " details");
			x++;
			stuArr[i].display();
		}
		// end display student data section

		// start find students data section by id
		System.out.println("----------------------------------------\n");
		System.out.println("---------- Find Students Data by with their ID ---------");
		System.out.print("Enter student ID : ");
		int inpStuId = sc.nextInt();
		boolean hasStuStatus = false;

		for (int i = 0; i < stuArr.length; i++) {
			if (inpStuId == stuArr[i].getStudentId()) {
				System.out.println("\n=> Details of student ID " + inpStuId);
				stuArr[i].display();
				hasStuStatus = true;
				break;
			}
		}
		if (!hasStuStatus) {
			System.err.println("Student ID " + inpStuId + " is not found!");
		}
		// end find students data section by id

		// start find maximum marks student section
		System.out.println("----------------------------------------\n");
		System.out.println("-------------- Maximum Marks Student ------------");
		int maxMark = 0;
		int totalMark = 0;
		String maxMarkStu = "Maung Bo";
		for (int i = 0; i < stuArr.length; i++) {
			totalMark += stuArr[i].getMark();
			if (maxMark < stuArr[i].getMark()) {
				maxMark = stuArr[i].getMark();
				maxMarkStu = stuArr[i].getName();
			}
		}
		System.out.println("The maximum marks student is : " + maxMarkStu + " with " + maxMark + " marks.");
		// end find maximum marks student section

		// start average marks section
		System.out.println("----------------------------------------\n");
		System.out.println("-------------- Average Marks of all the Students ------------");
		double averageMark = (totalMark / stuQty);
		String avgMarkStr = String.format("%.2f", averageMark);
		System.out.println("Average marks over all the students are : " + avgMarkStr + " marks.");
		// end average marks section

	}
}
