package userinput;

import java.util.Scanner;

public class Main {
	public static void main(String Args[]) {
		
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the inputs");
		
		String name=obj.nextLine();
		int age = obj.nextInt();
		double salary =obj.nextDouble();
		
		System.out.println("My name is   "+name);
		
		System.out.println("My age is   "+age);
		
		System.out.println("My salary is  "+salary);
		
		
	}

}
