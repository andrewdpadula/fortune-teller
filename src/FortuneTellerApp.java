import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your first name.");
		String userFirstName = input.nextLine();
		System.out.println("Now please enter your last name.");
		String userLastName = input.nextLine();
		System.out.println("How old are you, " + userFirstName + " " + userLastName + "?");
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

		if (userAge % 2 == 0) {
			int yearsUntilRetire = 70;
		} else {
			int yearsUntilRetire = 75;
		}

		if (userSiblings == 0) {
			String vacationHome = "Reykjavik, Iceland";
		}
		if (userSiblings == 1) {
			String vacationHome = "Auckland, New Zealand";
		}
		if (userSiblings == 2) {
			String vacationHome = "Nashville, Tennessee";
		}
		if (userSiblings == 3) {
			String vacationHome = "Toronto, Canada";
		}
		if (userSiblings > 3) {
			String vacationHome = "Florence, Italy";
		}
		if (userSiblings < 0) {
			String vacationHome = "the friendly town of Hell, Michigan";
		}

		if (favoriteColor.toLowerCase().equals("red")) {
			String meansOfTransit = "Ford pickup truck";
		}
		if (favoriteColor.toLowerCase().equals("orange")) {
			String meansOfTransit = "PT Cruiser";
		}
		if (favoriteColor.toLowerCase().equals("yellow")) {
			String meansOfTransit = "school bus";
		}
		if (favoriteColor.toLowerCase().equals("green")) {
			String meansOfTransit = "John Deere tractor";
		}
		if (favoriteColor.toLowerCase().equals("blue")) {
			String meansOfTransit = "unicycle";
		}
		if (favoriteColor.toLowerCase().equals("indigo")) {
			String meansOfTransit = "Vespa scooter";
		}
		if (favoriteColor.toLowerCase().equals("violet")) {
			String meansOfTransit = "skateboard";
		}

		if (birthMonth >= 1 && birthMonth <= 4) {
			String bankBalance = "$450,725.89";
		}
		if (birthMonth >= 5 && birthMonth <= 8) {
			String bankBalance = "$20,114.37";
		}
		if (birthMonth >= 9 && birthMonth <= 12) {
			String bankBalance = "$15.66";
		}
		if (birthMonth < 1 || birthMonth > 12) {
			String bankBalance = "$0.00";
		}
		
		System.out.println(userFirstName + userLastName + "will retire in " + yearsUntilRetire + " years with " + bankBalance + " in the bank, a vacation home in " + vacationHome + ", and travel by" + meansOfTransit + ".");
		
	
/*		System.out.println(userFirstName + userLastName + " will retire in "
				+ yearsUntilRetire + " years with " +bankBalance
				+ " in the bank, a vacation home in " + vacationHome
				+ ", and travel by " + meansOfTransit + ".");
	*/
		
	}
}
