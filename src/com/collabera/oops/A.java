package com.collabera.oops;

//used to initialize an object

public class A {

	int i, j, k;

	A(int i, int j) {
		this(i, j, 10);
	}

	A(int i, int j, int k) {
		this.i = i;
		this.j = j;
		this.k = k;
	}

}

class TestA {
	public static void main(String[] args) {
		A obj = new A(2, 3);

		System.out.println(obj.i);
		System.out.println(obj.j);
		System.out.println(obj.k);
	}
}
