package com.cg.basic;

import java.util.Scanner;

public class GetEmployeeData {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Accept employee information
        System.out.println("Enter employee information:");

        System.out.print("Employee ID: ");
        int employeeId = scanner.nextInt();

        System.out.print("Employee Name: ");
        String employeeName = scanner.next();

        System.out.print("Employee Department: ");
        String department = scanner.next();

        System.out.print("Employee Salary: ");
        double salary = scanner.nextDouble();

        // Display the entered information
        System.out.println("\nEmployee Information:");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);

        // Close the scanner
        scanner.close();
    }
}