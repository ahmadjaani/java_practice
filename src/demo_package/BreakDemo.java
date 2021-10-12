package demo_package;

public class BreakDemo {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		// enhanced for loop i.e. foreach loop
		System.out.println("Only Odd Numbers:");

		for (int i : arr) {
			if (i % 2 == 0)
				continue;

			System.out.println(i);
		}

		System.out.println("Numbers less than 4");
		for (int i : arr) {
			if (i == 4)
				break;

			System.out.println(i);
		}

	}

}
