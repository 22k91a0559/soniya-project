package WrapperClass;
public class WrapperBasic {
    public static void main(String[] args) {
        int num = 100;              
        Integer wrappedNum = num;  

        System.out.println("Primitive int value: " + num);
        System.out.println("Wrapped Integer object: " + wrappedNum);
    }
}
