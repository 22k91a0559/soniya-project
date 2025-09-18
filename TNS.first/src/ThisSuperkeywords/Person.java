package ThisSuperkeywords;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name; // refers to instance variable
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {
        Person p = new Person("Alice", 20);
        p.printDetails();
        p.setName("Bob");
        p.printDetails();
    }
}



