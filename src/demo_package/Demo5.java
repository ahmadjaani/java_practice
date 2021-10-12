package demo_package;

import java.util.Scanner;

public class Demo5 {

	/*
	 * enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Your Fav Day : ");
		String day = scanner.next();

		switch (day.toUpperCase()) {
		case "MONDAY":
			System.out.println("Monday Blues");
			break;
		case "TUESDAY":
			System.out.println("All Set to work");
			break;
		case "WEDNESDAY":
			System.out.println("Work in progress");
			break;
		case "THURSDAY":
			System.out.println("Work in full swing");
			break;
		case "FRIDAY":
			System.out.println("It's weekend!");
			break;
		case "SATURDAY":
			System.out.println("Enjoying Weekend");
			break;
		case "SUNDAY":
			System.out.println("Weekend is passing so fast!!");
			break;

		default:
			System.out.println("Invalid Day!");
			break;
		}
	}

}
