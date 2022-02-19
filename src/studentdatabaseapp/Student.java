package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int classStanding;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;
    //Constructor: Prompt user to enter Name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("Class Options:\n1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\n" +
                "Enter student class standing: ");
        this.classStanding = in.nextInt();

        setStudentID();
        //System.out.println(firstName + lastName + studentID);
    }
    //Generate an ID
    private void setStudentID() {
        //Grade level + ID
        id++;
        this.studentID = classStanding + "" + id;
    }
    //Enroll in Courses
    public void enroll() {
        //Loop until user hits Q
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses += "\n  " + course;
                tuitionBalance += costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);
        //System.out.println("ENROLLED IN: " + courses);
        //System.out.println("TUITION BALANCE: " + tuitionBalance);
    }
    //View Balance
    public void viewBalance() {
        System.out.println("Your Balance is : $" + tuitionBalance);
    }
    //Pay Tuition
    public void payTuition() {
        viewBalance();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the payment amount: ");
        int payment = in.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }
    //Show Status
    public String showInfo() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: " + classStanding +
                "\nStudent ID: " + studentID+
                "\nCourses Enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }
}
