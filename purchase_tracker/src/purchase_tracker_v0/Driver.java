/*	Program Name:	Purchase Tracker
 * 	Author:			Matthew Liffrig
 * 	Date: 			5-28-24
 *  Description:	This is the Driver class for Green Boost Purchase Tracker.
 *  				This class collects information from the client and uses
 *  				classes within this package to track purchases and inventory.
 */

package purchase_tracker_v0;

import java.util.Scanner;  // Import the Scanner class

public class Driver {

	public static void main(String[] args) {

		int menu_selection = 0; // Initialize menu_selection to 0
		
		String selected_inventory_address = null;
		String selected_inventory = null;

		Inventory inventory = new Inventory(); // Initialize inventory

		Scanner scanner = new Scanner(System.in);  // Create a Scanner object to read input

		// Print menu for client
		System.out.println("\nWelcome to Green Boost Purchase Tracker!\n" +
		                   "\nSelect an option from the menu followed by the return/enter key:" +
		                   "\n1. Edit Inventory" +
		                   "\n2. Edit Transactions" +
		                   "\n3. View Inventory" +
                           "\n4. View Trends" +
						   "\n5. View Predicted Demand");

		System.out.print("\nYour input: ");
		menu_selection = scanner.nextInt(); // Collect client input and store it in menu_selection
		System.out.println("You have selected " + menu_selection + ".");
		
		System.out.println("Please select an inventory path or hit return/enter for default inventory: ");
		selected_inventory_address = scanner.nextLine();
		if (selected_inventory_address == null) {
			selected_inventory_address = "/..";
			System.out.println("You have selected " + selected_inventory);
		} else {
			// TODO: Implement a way to print out only the file name
			System.out.println("You have selected " + selected_inventory);
		}

		// Determines how the software reacts to client input
		switch(menu_selection) {

			// Edit Inventory
			case 1:

				break;

			// Edit Transactions
			case 2:

				break;

			// View Inventory
			case 3:

				break;

			// View Trends
			case 4:

				break;

			// View Predicted Demand
			case 5:

				break;

			// Default Case - Invalid Menu Selection
			default:

				System.out.println("Invalid Menu Selection.");
				break;

		}

		scanner.close(); // Close scanner to avoid resource leak
	} // End main

} // End Driver class
