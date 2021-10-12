package com.collabera.oops;

public class Demo2 {
	int i, j;

	//instance block
	{
		i = 1;
		j = 2;
	}

	public Demo2() {
		System.out.println("i : " + i);
		System.out.println("j : " + j);
		System.out.println("Greetings from Demo2() constructor! ^_^");
	}

	public static void main(String[] args) {
		Demo2 obj = new Demo2();
		/*
		 * Demo2 obj2 = new Demo2(); Demo2 obj3 = new Demo2(); Demo2 obj8 = new Demo2();
		 * Demo2 obj4 = new Demo2(); Demo2 obj5 = new Demo2(); Demo2 obj6 = new Demo2();
		 * Demo2 obj7 = new Demo2();
		 */

		System.out.println(obj.i + "\t" + obj.j);
		/*
		 * System.out.println(obj2.i + "\t" + obj2.j); System.out.println(obj3.i + "\t"
		 * + obj3.j); System.out.println(obj4.i + "\t" + obj4.j);
		 * System.out.println(obj5.i + "\t" + obj5.j); System.out.println(obj6.i + "\t"
		 * + obj6.j); System.out.println(obj7.i + "\t" + obj7.j);
		 * System.out.println(obj8.i + "\t" + obj8.j);
		 */
	}
}
