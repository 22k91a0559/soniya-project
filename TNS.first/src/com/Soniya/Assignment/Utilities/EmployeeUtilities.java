package com.Soniya.Assignment.Utilities;
import com.Soniya.Assignment.Employee.*;

/**
 * Utility class that provides operations on Employee objects.
 * Demonstrates proper usage of access modifiers and packages.
 */
public class EmployeeUtilities {

    /**
     * Prints details of an employee.
     * @param e Employee object
     */
    public static void printEmployeeDetails(Employee e) {
        System.out.println("Name: " + e.getName() +
                           ", ID: " + e.getEmployeeId() +
                           ", Salary: " + e.getSalary());
    }

    /**
     * Calculates the yearly salary of an employee.
     * @param e Employee object
     * @return yearly salary
     */
    public static double calculateYearlySalary(Employee e) {
        return e.getSalary() * 12;
    }

    /**
     * Compares the salaries of two employees and returns the one with higher salary.
     * @param e1 First employee
     * @param e2 Second employee
     * @return Employee with higher salary
     */
    public static Employee compareSalaries(Employee e1, Employee e2) {
        return (e1.getSalary() > e2.getSalary()) ? e1 : e2;
    }
}
