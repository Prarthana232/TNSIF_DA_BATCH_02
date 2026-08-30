package employee;

import java.util.Scanner;

public class EmployeeDemo {

    // Employee Class
    static class Employee {

        int id;
        String name;
        String department;

        Employee(int id, String name, String department) {
            this.id = id;
            this.name = name;
            this.department = department;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Fixed Size Array of Objects
        Employee emp[] = new Employee[5];

        // Creating Employee Objects
        emp[0] = new Employee(101, "Bindu", "IT");
        emp[1] = new Employee(102, "Rahul", "HR");
        emp[2] = new Employee(103, "Ananya", "Finance");
        emp[3] = new Employee(104, "Kiran", "IT");
        emp[4] = new Employee(105, "Rohit", "HR");

        // User Input
        System.out.print("Enter Department to Search: ");
        String searchDept = sc.next();

        // String Object using new keyword
        String dept = new String(searchDept);

        boolean found = false;

        // Search Employees
        for (Employee e : emp) {

            if (e.department.equalsIgnoreCase(dept)) {

                if (!found) {
                    System.out.println("\nEmployees in " + dept + " Department");
                    System.out.println("---------------------------------------");
                }

                System.out.println("Employee ID   : " + e.id);
                System.out.println("Employee Name : " + e.name);
                System.out.println("Department    : " + e.department);
                System.out.println();

                found = true;
            }
        }

        if (found) {
            System.out.println("The above employees belong to the " + dept + " Department.");
        } else {
            System.out.println("Department Not Found.");
        }

        sc.close();
    }
}