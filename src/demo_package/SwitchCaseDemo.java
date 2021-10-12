package demo_package;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("*********Arithmetic Calculator********");
		System.out.println("*********** 1. Addition **************");
		System.out.println("*********** 2. Subtraction ***********");
		System.out.println("*********** 3. Multiplication ********");
		System.out.println("*********** 4. Quotient **************");
		System.out.println("*********** 5. Modulo ****************");
		System.out.println("*********** 6. Percentage ************");

		System.out.println("Select an Arithmetic Operation>>>");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:

			break;
		case 2:

			break;
		case 3:

			break;
		case 4:

			break;
		case 5:

			break;
		case 6:
			System.out.println("Thanks for choosing this option!!");
			System.out.println("Enter the number");
			int num = sc.nextInt();
			System.out.println("Enter the percent for: " + num);
			int perc = sc.nextInt();

			System.out.println("Result : " + (num / 100) * perc);

			break;

		default:
			break;
		}

		System.out.println();

	}

}
