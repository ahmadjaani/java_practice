package demo_package;

import java.util.Scanner;

/*
 * @author: Jimmy
 * @about: this class shows reading input from the user
 */
public class Demo2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Your Name:");
		String name = input.nextLine();

		System.out.println("Enter Your Age:");
		int age = input.nextInt();

		if (age < 20)
			System.err.println("You're not eligible for this training, join after " + (20 - age) + " years");
		else
			System.out.println("Hi, " + name + "," + age + " Welcome to Java Training");
	}

}
/*
 * System.in -> Keyboard; 
 * System.out -> Console;
 * System.err -> Console
 * 
 * CTRL+SHIFT+L -> To see all shortcuts
 */