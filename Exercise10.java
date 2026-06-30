package day3;

public class Exercise10 {
    public static void main(String[] args) {
        EmployeeInfo emp = new EmployeeInfo(108, "Bavanavelan", 50000);
        emp.displayDetails();
        emp.calculateSalary();
    }
}
abstract class Persons {
    Persons() {
        System.out.println("Person Constructor Called");
    }
    abstract void displayDetails();
}
interface SalaryCalculation {
    void calculateSalary();
}
class EmployeeInfo extends Persons implements SalaryCalculation {
    int employeeId;
    String employeeName;
    double salary;
    EmployeeInfo(int employeeId, String employeeName, double salary) {
        super(); // Calls Person constructor
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }
    @Override
    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
    }
    @Override
    public void calculateSalary() {
        System.out.println("Salary: Rs. " + salary);
    }
}