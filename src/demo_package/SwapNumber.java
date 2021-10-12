package demo_package;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter two numbers:");

		int num1 = input.nextInt();

		int num2 = input.nextInt();

		System.out.println("Before Swap : " + num1 + "\t" + num2);

		num1 = num1 - num2;
		num2 = num1 + num2;
		num1 = num2 - num1;

		System.out.println("After Swap : " + num1 + "\t" + num2);

	}

}
