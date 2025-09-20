package Encapsulation;
public class Person {
    private String name; 

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Alice");
        System.out.println("Name: " + person.getName()); 
    }
}

