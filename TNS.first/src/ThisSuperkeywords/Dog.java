package ThisSuperkeywords;

class Dog extends Animal {
    String type = "Dog";

    public void makeSound() {
        super.makeSound(); 
        System.out.println("The dog barks");
        System.out.println("Super type: " + super.type); 
        System.out.println("This type: " + this.type);  
    }
}

