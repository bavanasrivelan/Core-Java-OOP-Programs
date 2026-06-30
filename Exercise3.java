package day3;

public class Exercise3 {
    public static void main(String[] args) {
        FullTimeEmployee fullTime = new FullTimeEmployee();
        PartTimeEmployee partTime = new PartTimeEmployee();
        fullTime.calculateSalary();
        partTime.calculateSalary();
    }
}
class Employee {
    void calculateSalary() {
        System.out.println("Calculating Employee Salary");
    }
}
class FullTimeEmployee extends Employee {
    @Override
    void calculateSalary() {
        System.out.println("Full Time Employee Salary: Rs. 50000");
    }
}
class PartTimeEmployee extends Employee {
    @Override
    void calculateSalary() {
        System.out.println("Part Time Employee Salary: Rs. 20000");
    }
}