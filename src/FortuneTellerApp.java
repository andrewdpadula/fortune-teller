import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your first name.");
		String userFirstName = input.nextLine();
		System.out.println("Now please enter your last name.");
		String userLastName = input.nextLine();
		System.out.println("How old are you?");
		int userAge = input.nextInt();

		System.out.println("In what month were you born? Enter 1 for January, 2 for February, 3 for March, etc.");
		int birthMonth = input.nextInt();
		System.out.println("What is your favorite ROYGBIV color? If you don't know what ROYGBIV means,"
				+ " type Help for assistance.");
		String favoriteColor = input.next();
		if (favoriteColor.toLowerCase().equals("help")) {
			System.out.println("Choose one of the ROYGBIV colors. They are:"
					+ " Red, orange, yellow, green, blue, indigo, or violet.");
			favoriteColor = input.next();
		}
		System.out.println("One more question before I predict your future. How many siblings do you have?");
		int userSiblings = input.nextInt();

		int yearsUntilRetire = 0;
		if (userAge % 2 == 0) {
			yearsUntilRetire = 70;
		}
		if (userAge % 2 == 1) {
			yearsUntilRetire = 75;
		}

		String vacationHome = null;
		if (userSiblings == 0) {
			vacationHome = "Reykjavik, Iceland";
		}
		if (userSiblings == 1) {
			vacationHome = "Auckland, New Zealand";
		}
		if (userSiblings == 2) {
			vacationHome = "Nashville, Tennessee";
		}
		if (userSiblings == 3) {
			vacationHome = "Toronto, Canada";
		}
		if (userSiblings > 3) {
			vacationHome = "Florence, Italy";
		}
		if (userSiblings < 0) {
			vacationHome = "the friendly town of Hell, Michigan";
		}

		String meansOfTransit = null;
		if (favoriteColor.toLowerCase().equals("red")) {
			meansOfTransit = "Ford pickup truck";
		}
		if (favoriteColor.toLowerCase().equals("orange")) {
			meansOfTransit = "PT Cruiser";
		}
		if (favoriteColor.toLowerCase().equals("yellow")) {
			meansOfTransit = "school bus";
		}
		if (favoriteColor.toLowerCase().equals("green")) {
			meansOfTransit = "John Deere tractor";
		}
		if (favoriteColor.toLowerCase().equals("blue")) {
			meansOfTransit = "unicycle";
		}
		if (favoriteColor.toLowerCase().equals("indigo")) {
			meansOfTransit = "Vespa scooter";
		}
		if (favoriteColor.toLowerCase().equals("violet")) {
			meansOfTransit = "skateboard";
		}
		String bankBalance = null;
		if (birthMonth >= 1 && birthMonth <= 4) {
			bankBalance = "$450,725.89";
		}
		if (birthMonth >= 5 && birthMonth <= 8) {
			bankBalance = "$20,114.37";
		}
		if (birthMonth >= 9 && birthMonth <= 12) {
			bankBalance = "$15.66";
		}
		if (birthMonth < 1 || birthMonth > 12) {
			bankBalance = "$0.00";
		}

		System.out.println(userFirstName + " " + userLastName + " will retire in " + yearsUntilRetire + " years with "
				+ bankBalance + " in the bank, a vacation home in " + vacationHome + ", and travel by " + meansOfTransit
				+ ".");

	}
}
