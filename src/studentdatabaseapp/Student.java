package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int classStanding;
    private int studentID;
    private String courses;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1001;
    //Constructor: Prompt user to enter Name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("Class Options:\n1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\n" +
                "Enter student class standing: ");
        this.classStanding = in.nextInt();

        System.out.println(firstName + lastName + classStanding);
    }
    //Generate an ID

    //Enroll in Courses

    //View Balance

    //Pay Tuition

    //Show Status
}
