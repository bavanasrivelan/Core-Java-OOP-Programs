package day3;

public class Exercise4 {
    public static void main(String[] args) {
        Student student = new Student("Bavanavelan", 19, 108, "IT");
        student.displayDetails();
    }
}
class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Student extends Person {
    int rollNo;
    String department;
    Student(String name, int age, int rollNo, String department) {
        super(name, age); // Calling parent class constructor
        this.rollNo = rollNo;
        this.department = department;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Department: " + department);
    }
}