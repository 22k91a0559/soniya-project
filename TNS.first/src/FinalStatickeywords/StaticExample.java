package FinalStatickeywords;
public class StaticExample {
    static int count = 0;
    static void displayCount() {
        System.out.println("Static variable count: " + count);
    }
    public static void main(String[] args) {
        StaticExample.count = 5; 
        StaticExample.displayCount(); 

        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();

        obj1.count++;
        obj2.count++;
        StaticExample.displayCount();
    }
}

