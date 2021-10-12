package com.mycomany.inheritance;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ArrayDemo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array:- ");
		int size = scanner.nextInt();

		int[] ints = new int[size];

		for (int i = 0; i < ints.length; i++) {
			System.out.println("Enter "+(i+1)+" Array Element:");
			
			ints[i] = scanner.nextInt();
		}

		//Stream API from Java 8
		IntStream.of(ints).forEach(System.out::println);
	}

}
