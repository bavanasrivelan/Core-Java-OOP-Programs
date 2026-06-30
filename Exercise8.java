package day3;

public class Exercise8 {
    public static void main(String[] args) {
        Students student = new Students("Bavanavelan", 108);
        College.displayCollege();
        student.displayStudent();
    }
}
interface College {
    String collegeName = "KCE";
    static void displayCollege() {
        System.out.println("College Name: " + collegeName);
    }
}
class Students implements College {
    String name;
    int rollNo;
    Students(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("College: " + collegeName);
    }
}