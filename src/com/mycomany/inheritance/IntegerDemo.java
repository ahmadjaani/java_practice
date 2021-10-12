package com.mycomany.inheritance;

import java.util.Scanner;

public class IntegerDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number");

		int num = scanner.nextInt();

		System.out.println(num + "'s binary format : " + Integer.toBinaryString(num));
		System.out.println(num + "'s hexa format : " + Integer.toHexString(num));
		System.out.println(num + "'s octal format : " + Integer.toOctalString(num));

	}

}
