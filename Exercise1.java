package day3;
public class Exercise1 {

	public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Usage: java StudentInfo <RollNo> <Name> <Department> <Mark>");
            return;
        }
        System.out.println("Roll No: " + args[0]);
        System.out.println("Name: " + args[1]);
        System.out.println("Department: " + args[2]);
        System.out.println("Mark: " + args[3]);

	}
}