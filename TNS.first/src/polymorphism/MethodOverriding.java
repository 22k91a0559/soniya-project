package polymorphism;
public class MethodOverriding {
    public static void main(String[] args) {
        Animal obj1 = new Animal();
        Animal obj2 = new Dog();
        obj1.sound(); 
        obj2.sound(); 
    }
}

