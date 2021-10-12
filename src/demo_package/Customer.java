package demo_package;

public class Customer {
	int id;
	String name;
	String email;
	String city;
	static String country = "Philippines";

	static int count;

	//instance initialization block
	{
		count++;
		System.out.println("Inside Initialization block");
	}

	public void printCustomerDetails() {
		System.out.println(this.id + "\t" + this.name + "\t" + this.email + "\t" + this.city + "\t" + Customer.country);
	}

	// this keyword is alias for an object
}

class TestCustomer {
	public static void main(String[] args) {
		Customer raza = new Customer();
		raza.id = 101;
		raza.name = "raza";
		raza.email = "raza@email.com";
		raza.city = "Manila";

		Customer ayan = new Customer();
		ayan.id = 102;
		ayan.name = "ayan";
		ayan.email = "ayan@email.com";
		ayan.city = "Quezon";
		
		Customer kyle = new Customer();
		kyle.id = 103;
		kyle.name = "kyle";
		kyle.email = "kyle@email.com";
		kyle.city = "Quezon";
		
		Customer nicko = new Customer();
		nicko.id = 103;
		nicko.name = "nicko";
		nicko.email = "nicko@email.com";
		nicko.city = "Manila";

		raza.printCustomerDetails();
		ayan.printCustomerDetails();
		kyle.printCustomerDetails();
		nicko.printCustomerDetails();

		System.out.println("Count of Customers : " + Customer.count);

	}
}
