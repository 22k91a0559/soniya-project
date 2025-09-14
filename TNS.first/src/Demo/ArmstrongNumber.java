package Demo;
import java.util.Scanner;

public class ArmstrongNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        int originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;    
            sum = sum + (digit * digit * digit);  
            number = number / 10;         
        }
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrongnumber.");
        } else {
            System.out.println(originalNumber + " is not an Armstrongnumber.");
        }
        
        input.close();
    }
}