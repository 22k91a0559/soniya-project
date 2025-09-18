package FinalStatickeywords;

public class FinalExample {
    final int number = 10;
    final void display() {
        System.out.println("This is a final method.");
    }

    public static void main(String[] args) {
        FinalExample obj = new FinalExample();

        // Access final variable
        System.out.println("Final variable number: " + obj.number);
        obj.display();
    }
}
