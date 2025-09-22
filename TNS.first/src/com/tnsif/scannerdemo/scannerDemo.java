package com.tnsif.scannerdemo;
import java.util.Scanner;  //Explicit Import 

public class scannerDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = sc.nextLine();
		
		System.out.println("Enter your Location");
		String location = sc.nextLine();
		
		System.out.println("Enter your Salary");
		int sal  = sc.nextInt();
		
		System.out.println("The name is: "+name + "The location is: "+location+ " the salary is "+sal);
		sc.close();
	}

}