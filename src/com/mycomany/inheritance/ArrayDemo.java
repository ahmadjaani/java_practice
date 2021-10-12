package com.mycomany.inheritance;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		double[] arr = new double[5];

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		for (double i : arr) {
			System.out.println(i);
		}

		String[] strArray = new String[3];
		strArray[0] = "abc";
		strArray[1] = "def";
		strArray[2] = "xyz";

		System.out.println("---------string array-------");
		for (String string : strArray) {
			System.out.println(string);
		}

		int[] ints = { 2, 3, 4, 5, 6 };

		Integer[] integers = new Integer[] { Integer.valueOf(20), 30, 40, Integer.valueOf(50) };

		System.out.println("---------integer array-------");
		for (Integer integer : integers) {
			System.out.println(integer);
		}

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 3 numbers for addition");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();

		System.out.println("Sum : " + Integer.sum(n1, Integer.sum(n2, n3)));

	}

}
