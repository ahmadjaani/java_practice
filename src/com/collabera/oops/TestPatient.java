package com.collabera.oops;

public class TestPatient {
	public static void main(String[] args) {
		Patient p1 = new Patient();

		p1.setId(101);
		p1.setCity("Manila");
		p1.setName("Smith");
		p1.setContact(987654321);

		System.out.println(p1.getId());
		System.out.println(p1.getName());
		System.out.println(p1.getCity());
		System.out.println(p1.getContact());
		System.out.println("**********************************");
		Patient p2 = new Patient(102, "carl", "Mumbai", 887766554);
		System.out.println(p2.getId());
		System.out.println(p2.getName());
		System.out.println(p2.getCity());
		System.out.println(p2.getContact());

		Patient p3 = new Patient();
		//accept patient values from the user and display the object
		

	}
}
/*
 * The field Patient.id is not visible The field Patient.name is not visible The
 * field Patient.city is not visible The field Patient.city is not visible
 */