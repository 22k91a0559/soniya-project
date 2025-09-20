package com.Soniya.Assignment.Employee;
/**
 * The Employee class represents a generic employee.
 */
public class Employee {
    private String name;
    private int employeeId;
    private double salary;

    /**
     * Gets the employee's name.
     * @return name of the employee
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the employee's name.
     * @param name employee name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the employee ID.
     * @return employee ID
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the employee ID.
     * @param employeeId employee ID
     */
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * Gets the employee salary.
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the employee salary.
     * @param salary salary value
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

