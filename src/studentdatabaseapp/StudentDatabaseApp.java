package studentdatabaseapp;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.enroll();
        s1.payTuition();
        System.out.println(s1.showInfo());
        //Ask how many users to add

        //Create n number of new students
    }

}
