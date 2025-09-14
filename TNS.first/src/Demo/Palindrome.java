package Demo;
import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome: ");
        String inputString = scanner.nextLine();

        String reverseString = "";
        int length = inputString.length();

        // Reverse the input string
        for (int i = length - 1; i >= 0; i--)
            reverseString = reverseString + inputString.charAt(i);

        // Check if original and reversed strings are equal
        if (inputString.equals(reverseString))
            System.out.println("Input string is a palindrome.");
        else
            System.out.println("Input string is not a palindrome.");

        scanner.close();
    }
}