package com.cg.basic;


//Define an Enum for EmployeeType
enum EmployeeType {
 MANAGER,
 ENGINEER,
 SALESPERSON
}

//Define the Employee class
class Employee {
 private String name;
 private EmployeeType type;
 
 // Constructor
 public Employee(String name, EmployeeType type) {
     this.name = name;
     this.type = type;
 }
 
 // Getter for employee type
 public EmployeeType getType() {
     return type;
 }
 
 // Method to perform specific action based on employee type
 public void performDuties() { 
     switch (this.type) {
         case MANAGER:
             System.out.println(name + " is managing the team.");
             break;
         case ENGINEER:
             System.out.println(name + " is coding.");
             break;
         case SALESPERSON:
             System.out.println(name + " is selling products.");
             break;
         default:
             System.out.println("Invalid employee type.");
     }
 }
}
