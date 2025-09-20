package com.Soniya.Assignment.Utilities;
import com.Soniya.Assignment.Employee.*;
import com.Soniya.Assignment.Utilities.*;

/**
 * The AssignmentMain class is the entry point of the program.
 * Demonstrates creation of Manager and Developer objects,
 * and usage of EmployeeUtilities methods.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        // Create Manager object
        Manager m = new Manager();
        m.setName("Alice");
        m.setEmployeeId(101);
        m.setSalary(90000);
        m.setDepartment("HR");

        // Create Developer object
        Developer d = new Developer();
        d.setName("Bob");
        d.setEmployeeId(102);
        d.setSalary(80000);
        d.setProgrammingLanguage("Java");

        // Use utility methods
        System.out.println("=== Employee Details ===");
        EmployeeUtilities.printEmployeeDetails(m);
        EmployeeUtilities.printEmployeeDetails(d);

        System.out.println("\n=== Yearly Salaries ===");
        System.out.println("Manager Yearly Salary: " + EmployeeUtilities.calculateYearlySalary(m));
        System.out.println("Developer Yearly Salary: " + EmployeeUtilities.calculateYearlySalary(d));

        System.out.println("\n=== Salary Comparison ===");
        Employee higherPaid = EmployeeUtilities.compareSalaries(m, d);
        System.out.println("Higher Paid Employee: " + higherPaid.getName());
    }
}

