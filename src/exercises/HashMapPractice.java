package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        Integer IdNumber;
        do {
            System.out.println("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.println("Id Number: ");
                IdNumber = input.nextInt();
                students.put(newStudent, IdNumber);
                input.nextLine();
            }
        } while (!newStudent.equals(""));

        System.out.println("\nclass roster: ");

        for (Map.Entry<String, Integer> student: students.entrySet()) {
            System.out.println("\nIdNumber: " + student.getValue() + "," + "\nStudent Name: " + student.getKey());

        }





    }
}

//Make a program similar to GradebookHashMap that does the following:
// It takes in student names and ID numbers (as integers) instead of names and grades.
//The keys should be the IDs and the values should be the names.
//Modify the roster printing code accordingly.