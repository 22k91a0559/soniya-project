package com.Soniya.Assignment.Employee;
/**
 * The Manager class extends Employee.
 * Adds a department attribute specific to managers.
 */
public class Manager extends Employee {
    private String department;

    /**
     * Gets the manager's department.
     * @return department name
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the manager's department.
     * @param department department name
     */
    public void setDepartment(String department) {
        this.department = department;
    }
}
