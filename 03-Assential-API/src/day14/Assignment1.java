package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		System.out.println("-------------- Collection Assignment 1 by Bo Bo Aung --------------\n");
		System.out.println("-------------- Welcom to Zero to Pro Level3 Bootcamp Class -------------");

		Scanner sc = new Scanner(System.in);
		boolean restartStatus = true;

		ArrayList<String> studentList = new ArrayList<String>();

		studentList.add("Bo Htet");
		studentList.add("Aung Naing");
		studentList.add("Zin Bo");
		studentList.add("Kyaw Aung");
		studentList.add("Ba Sit");
		studentList.add("Bo Han Thu");
		studentList.add("Kyaw Zin Htet");
		studentList.add("Bo Myint Myat");
		studentList.add("Min Nanda Naing");
		studentList.add("Kaung Zin Thu");
		studentList.add("Khin Bo");

		try {
			while (restartStatus) {

				System.out.println("\n----------- What do you want to do? --------------");
				System.out.println("=> 1. Show all student names.");
				System.out.println("=> 2. Show names with sorting to (A-Z).");
				System.out.println("=> 3. Show names with sorting to (Z-A).");
				System.out.println("=> 4. Search the student and show his position in the list.");
				System.out.println("=> 5. Insert a new student.");
				System.out.println("=> 6. Search students whose names start with letter (i.e, 'K' or 'k').");
				System.out.println("=> 7. Remove students whose names end with letter (i.e, 'G' or 'g').");
				System.out.println("=> 8. Remove all students from the class.");
				System.out.println("=> 9. Exit from the class.");

				System.out.print("\nEnter a process numbert : => ");
				int inpNum = sc.nextInt();

				while (inpNum <= 0 || inpNum > 9) {
					System.err.print("Enter a number between (1,9), try again : ");
					inpNum = sc.nextInt();
				}

				System.out.println("");

				switch (inpNum) {
				case 1: { // show all students
					System.out.println("------------ All of our students are under the followings -------------");
					studentList.forEach(stu -> System.out.println("=> " + stu));
					break;
				}
				case 2: { // sort students names to A-Z
					System.out.println("------------- All students names with sorting to A-Z -------------");
					Collections.sort(studentList);
					studentList.forEach(stu -> System.out.println("=> " + stu));
					break;
				}
				case 3: { // sort students names to Z-A
					System.out.println("------------ All students names with sorting to Z-A -------------");
					Collections.sort(studentList);
					Collections.reverse(studentList);
					studentList.forEach(stu -> System.out.println("=> " + stu));
					break;
				}
				case 4: { // search a index of student
					System.out.println("------------- Search a specified student -----------");
					System.out.print("Enter a student's name : => ");
					sc.nextLine();
					String inpStuName = sc.nextLine();
					int stuIndex = Collections.binarySearch(studentList, inpStuName);
					System.out.println((stuIndex >= 0)
							? "=> Your searched student name '" + inpStuName + "' is at position '" + stuIndex + "'."
							: "=> Your inputted student name doesn't exist!");
					break;
				}
				case 5: { // insert a new student
					System.out.println("------------- Insert a new student -----------");
					System.out.print("Enter a new student name : => ");

					while (sc.hasNextInt()) {
						System.err.print("Student name must have alphabet, try again : ");
						sc.next();
					}
					sc.nextLine();
					String inpNewStu = sc.nextLine();

					if (!studentList.contains(inpNewStu)) {
						studentList.add(inpNewStu);
						System.out.println("=> A new student '" + inpNewStu + "' is inserted to the class.");
					} else {
						System.err.println("=> You inserted a new student '" + inpNewStu + "' is exist in the class.");
					}
					break;
				}
				case 6: { // search names with start letter
					System.out.println("------------- Search Students' name who start with letter -----------");
					System.out.print("Enter the first letter of the students name : => ");
					String inpLetter = sc.next();
					studentList.removeIf(
							t -> (!t.startsWith(inpLetter.toUpperCase()) && !t.startsWith(inpLetter.toLowerCase())));
					System.out.println("Start with letter '" + inpLetter + "' names are under the followings.");
					studentList.forEach(stu -> {
						System.out.println("=> " + stu);
					});
					break;
				}
				case 7: { // remove names with end letter
					System.out.println("------------- Remove Students' name who end with letter -----------");
					ArrayList<String> remStuList = new ArrayList<>();
					System.out.print("Enter the last letter of the students name : => ");
					String inpLetter = sc.next();

					studentList.forEach(stu -> {
						if (stu.endsWith(inpLetter)) {
							remStuList.add(stu);
						}
					});

					if (remStuList.size() > 0) {
						studentList.removeIf(
								t -> (t.endsWith(inpLetter.toUpperCase()) || t.endsWith(inpLetter.toLowerCase())));
						System.out.println("The following students are end with letter '" + inpLetter
								+ "' ,so removed from the class.");
						remStuList.forEach(remStu -> System.err.println(remStu + " (removed)"));
					} else {
						System.err.println("Thre are no students end with the letter '" + inpLetter + "'.");
					}
					break;
				}
				case 8: { // remove all students
					System.out.println("------------- Remove All Students -----------");
					System.out.println("=> All of the students are removed from the class! :(");
					System.out.println("=> Now in the class have only have the teacher. xD");
					break;
				}
				case 9: { // exit from the class
					System.out.println("------------- Exited from the class -----------");
					System.out.println("=> Bye ;)");
					restartStatus = false;
					return;
				}

				}
				if (restartStatus) {
					System.out.print("\nPress 'y' to Main Menu and 'e' for Exit! : ");
					String inpVal = sc.next();
					String yOeValue = inpVal.toLowerCase();

					while (!yOeValue.equals("y") && !yOeValue.equals("e")) {
						System.err.print("Press 'y' or 'e' only, try again : ");
						yOeValue = sc.next();
					}
					if (yOeValue.equals("y")) {
						restartStatus = true;
					} else {
						restartStatus = false;
					}
				}
			}
		} catch (InputMismatchException e) {
			System.err.println("Main Menu input number must be a number!");
		} finally {
			sc.close();
			System.out.println("=> Exited from the class");
			System.out.println("=> Bye ;)");
		}
	}
}
