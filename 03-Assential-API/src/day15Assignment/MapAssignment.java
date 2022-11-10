package day15Assignment;

import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapAssignment {
    public static void main(String[] args) {
        System.out.println("============== day15 Map Assignment by Bo Bo Aung =================");

        // initial students
        Student stu1 = new Student(1, "U Hla");
        Student stu2 = new Student(3, "U Ba");
        Student stu3 = new Student(2, "Daw Mya");
        Student stu4 = new Student(6, "U Thein");
        Student stu5 = new Student(4, "Daw Kyi");
        Student stu6 = new Student(5, "Daw Aye");
        // initial students

        Map<Integer, Student> students = new LinkedHashMap<>();
        students.put(stu1.getRollNum(), stu1);
        students.put(stu2.getRollNum(), stu2);
        students.put(stu3.getRollNum(), stu3);
        students.put(stu4.getRollNum(), stu4);
        students.put(stu5.getRollNum(), stu5);
        students.put(stu6.getRollNum(), stu6);

        // students.forEach((k, v) -> {
        // System.out.println(k + "\t" + v.getName());
        // });

        Scanner sc = new Scanner(System.in);
        boolean restartStatus = true;

        try {

            while (restartStatus) {

                System.out.println("\n========== Main Menu of the Class ==========");
                System.out.println("=> 1. Insert a new student.");
                System.out.println("=> 2. Sorting by students roll number.");
                System.out.println("=> 3. Display all students.");
                System.out.println("=> 4. Update student data.");
                System.out.println("=> 5. Search student with roll number.");
                System.out.println("=> 6. Delete a specific student by roll number.");
                System.out.println("=> 7. Exit");

                System.out.print("\nEnter process number(1-7) : => ");
                int inpProcNum = sc.nextInt();

                while (inpProcNum <= 0 || inpProcNum > 7) {
                    System.err.print("Enter a number between (1,7), try again : ");
                    inpProcNum = sc.nextInt();
                }

                System.out.println("");

                switch (inpProcNum) {
                    case 1: {
                        System.out.println("============= Insert a new Student ==============");
                        System.out.print("Enter student roll number : => ");
                        int inpNewRoll = sc.nextInt();
                        Set<String> exitStu = new LinkedHashSet<>();

                        students.forEach((k, v) -> {
                            if (inpNewRoll == k) {
                                System.err
                                        .println("Roll number " + inpNewRoll + " is exist, name with " +
                                                v.getName());
                                exitStu.add("Shi Tal");
                                return;
                            }
                        });

                        if (exitStu.size() == 0) {
                            System.out.print("Enter student name : => ");
                            sc.nextLine();
                            String inpNewName = sc.nextLine();
                            students.put(inpNewRoll, new Student(inpNewRoll, inpNewName));
                            System.out.println("=> " + inpNewName + " is added with roll number " +
                                    inpNewRoll);
                        }

                        break;
                    }

                    case 2: {
                        System.out.println("============= Sorting Students by Roll Number ==============");
                        TreeMap<Integer, Student> stuRollSort = new TreeMap<>(students);

                        System.out.println("=> Sorted by students roll number.");
                        System.out.println("\nRoll No. Name");
                        System.out.println("=============");
                        stuRollSort.forEach((k, v) -> {
                            System.out.println(k + "\t" + v.getName());
                        });
                        break;
                    }

                    case 3: {
                        System.out.println("============= Display All Students ==============");
                        System.out.println("\nRoll No. Name");
                        System.out.println("=============");

                        students.forEach((k, v) -> {
                            System.out.println(k + "\t" + v.getName());
                        });
                        break;
                    }

                    case 4: {
                        System.out.println("============= Update Student Data ==============");
                        System.out.println("=> Change student name by roll number.");
                        Set<String> noStuRoll = new LinkedHashSet<>();
                        System.out.print("Enter student roll number : => ");
                        int inpStuRoll = sc.nextInt();

                        students.forEach((k, v) -> {
                            if (inpStuRoll == k) {
                                System.out.print("Enter new name for roll number " + inpStuRoll + " student : => ");
                                sc.nextLine();
                                v.setName(sc.nextLine());
                                System.out.println(
                                        "=> Successful update Roll No. " + inpStuRoll + " student name.");
                                noStuRoll.add("Shi Tal");
                            }
                        });

                        if (noStuRoll.size() == 0)
                            System.err.println("=> Input student roll number" + inpStuRoll + " doesn't exist!");
                        break;
                    }

                    case 5: {
                        System.out.println("============= Search Student Name by Roll Number ==============");
                        Set<String> noStuRoll = new LinkedHashSet<>();
                        System.out.print("Enter student Roll No. : => ");
                        int inpStuRoll = sc.nextInt();

                        students.forEach((k, v) -> {
                            if (inpStuRoll == k) {
                                System.out.println("Name of roll no. " + inpStuRoll + " is : => " +
                                        v.getName());
                                noStuRoll.add("Shi Tal");
                            }
                        });
                        if (noStuRoll.size() == 0)
                            System.err.println("=> There is no student wih roll number " + inpStuRoll);
                        break;
                    }

                    case 6: {

                        System.out.println(
                                "============= Delete a Specific Student According to Roll No. ==============");
                        int oriSize = students.size();

                        System.out.print("Enter student Roll No. : => ");
                        int inpStuRoll = sc.nextInt();
                        students.keySet().removeIf(k -> k.equals(inpStuRoll));

                        if (oriSize != students.size())
                            System.out.println("=> Student with roll no. " + inpStuRoll + " is removed.");
                        else
                            System.err.println("=> There is no student to remove with roll number " +
                                    inpStuRoll);
                        break;
                    }

                    case 7: {
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
            System.err.println("\nInput type number must be a number!");
            e.getMessage();

        } finally {
            sc.close();
            System.out.println("\n=> Exited!");
            System.out.println("=> Bye ;)");
        }
    }

}