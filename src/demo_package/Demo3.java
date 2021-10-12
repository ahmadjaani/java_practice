package demo_package;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");

		int num = input.nextInt();

		if (num % 2 == 1)
			System.out.println(num + " is an odd number!");
		else
			System.out.println(num + " is an even number!");

	}

}
/*
prime number: a number divisible only by itself
13, 17, 19, 31, 37 .....
*/