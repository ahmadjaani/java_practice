package demo_package;

public class CastingDemo {

	public static void main(String[] args) {
		double salary = 10000;

		int sal = (int) salary; // down casting

		long b = 10;

		byte l = (byte) b; //down casting

		System.out.println("Salary : " + sal);
		
		int rand = (int) ((Math.random())*50+1);
		System.out.println("Some Random Number : "+ rand);
	}

}

//Type mismatch: cannot convert from double to int