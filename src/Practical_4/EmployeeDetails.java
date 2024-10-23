package Practical_4;

//4. Write a java program to display the employee details using Scanner class.
import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine();  // Consume newline
        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        double empSalary = sc.nextDouble();

        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Salary: " + empSalary);
    }
}

