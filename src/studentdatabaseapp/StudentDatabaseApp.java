package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {

        //Ask how many Students to add
        System.out.print("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numStudents = in.nextInt();
        Student[] students = new Student[numStudents];

        //Create n number of new students
        for (int n = 0; n<numStudents; n++) {
            students[n]= new Student();
            students[n].enroll();
            students[n].payTuition();
        }

        for (int n = 0; n<numStudents; n++)
            System.out.println(students[n].showInfo());
    }
}
