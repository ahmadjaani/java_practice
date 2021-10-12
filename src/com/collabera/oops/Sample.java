package com.collabera.oops;

public class Sample {
	int i, j;

	// constructor to initialize an object
	Sample(int i, int j) {
		System.out.println(i + "\t" + j);
		this.i = i;
		this.j = j;
//		System.out.println("Inside Sample(int i, int j)");
	}

	public void print() {
		System.out.println("Sample Object : [ " + i + "\t" + j + " ]");
	}

}
