package com.Soniya.Assignment.Employee;
/**
 * The Developer class extends Employee.
 */
public class Developer extends Employee {
    private String programmingLanguage;

    /**
     * Gets the developer's programming language.
     * @return programming language
     */
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    /**
     * Sets the developer's programming language.
     * @param programmingLanguage programming language name
     */
    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}
