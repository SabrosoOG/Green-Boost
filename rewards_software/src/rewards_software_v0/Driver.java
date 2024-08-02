package rewards_software_v0;

import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class

public class Driver {

	public static void main(String[] args) {

		int menu_selection = 0; // Initialize menu_selection to 0

		boolean flag = true;
		String memberNumber = null;
		ArrayList<Member> list = new ArrayList<Member>();

		// Testing variables
		list.add(new Member("1234567890", "John", "Smith"));
		list.add(new Member("9876543210", "Jane", "Smith"));
		list.add(new Member("5555555555", "Mohammad", "Mohammad"));
		list.add(new Member("5555555555", "Jeff", "Jefferson"));
		list.add(new Member("5555555555", "Richard", "Richardson"));

		Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input

		while(flag = true) {
			System.out.println("Welcome to Green Boost Rewards Software!\n\n"
					+ "Please enter a phone number followed by the enter/return key: ");

			memberNumber = scanner.nextLine();
			// Remove hyphens from the input phone number
			memberNumber = memberNumber.replace("-", "");

			// Create a new list to hold matching members
			ArrayList<Member> matchingMembers = new ArrayList<>();

			for (Member member : list) {
				if (member.getPhoneNumber().equals(memberNumber)) {
					matchingMembers.add(member);
				}
			}

			// if no accounts found else accounts found
			if (matchingMembers.isEmpty()) {
				System.out.println("No members with phone number " + memberNumber + " found.");
				System.out.println("\nWould you like to create an account? (Y/N): ");
				String Y_or_N;
				Y_or_N = scanner.nextLine();
				if (Y_or_N == "Y" || Y_or_N == "y") {

				} else {
					break;
				}
			} else {
				int i = 1;
				System.out.println("Found " + matchingMembers.size() + " members with phone number " + memberNumber + ":");
				for (Member m : matchingMembers) {
					System.out.println("#" + i + ": " + m.getFirstName() + " " + m.getLastName());
					i++;
				}
			}

			/*
			 * // Print menu for client System.out.
			 * println("\nSelect an option from the menu followed by the return/enter key:"
			 * + "\n1. " + "\n2. " + "\n3. " + "\n4. " + "\n5. ");
			 * 
			 * System.out.print("\nYour input: "); menu_selection = scanner.nextInt(); //
			 * Collect client input and store it in menu_selection
			 * System.out.println("You have selected " + menu_selection + ".");
			 * 
			 * 
			 * // Determines how the software reacts to client input switch(menu_selection)
			 * {
			 * 
			 * // Edit Inventory case 1:
			 * 
			 * break;
			 * 
			 * // Edit Transactions case 2:
			 * 
			 * break;
			 * 
			 * // View Inventory case 3:
			 * 
			 * break;
			 * 
			 * // View Trends case 4:
			 * 
			 * break;
			 * 
			 * // View Predicted Demand case 5:
			 * 
			 * break;
			 * 
			 * // Default Case - Invalid Menu Selection default:
			 * 
			 * System.out.println("Invalid Menu Selection."); break;
			 * 
			 * }
			 * 
			 */
			System.out.println();
		} // end while flag
		scanner.close(); // Close scanner to avoid resource leak

	} // End main

} // End Driver class