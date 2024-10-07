package com.cg.basic;

import java.util.Scanner;

public class GetMulitpleEmployeeData {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();

        double totalSalary = 0;

        // Loop to get data for each employee
        for (int i = 1; i <= numEmployees; i++) {
            System.out.println("\nEnter details for employee " + i + ":");

            System.out.print("Employee ID: ");
            int employeeId = scanner.nextInt();

            System.out.print("Employee Name: ");
            String employeeName = scanner.next();

            System.out.print("Employee Department: ");
            String department = scanner.next();

            System.out.print("Employee Salary: ");
            double salary = scanner.nextDouble();

            // Add the salary to totalSalary
            totalSalary += salary;

            // Display the entered information
            System.out.println("\nEmployee Information:");
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Employee Name: " + employeeName);
            System.out.println("Department: " + department);
            System.out.println("Salary: " + salary);
        }

        // Display the total salary
        System.out.println("\nTotal Salary of all employees: " + totalSalary);

        // Close the scanner
        scanner.close();
    }
}
