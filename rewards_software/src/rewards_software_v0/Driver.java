package rewards_software_v0;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        int menu_selection = 0;
        boolean flag = true;
        boolean memberStatus = false;
        String memberNumber = null;
        String Y_or_N;
        Member currentMember;

        Scanner scanner = new Scanner(System.in);

        while (flag) {
            Y_or_N = null;
            System.out.print("Welcome to Green Boost Rewards Software!\n\n"
                    + "Please enter a phone number followed by the enter/return key: ");

            memberNumber = scanner.nextLine();
            memberNumber = memberNumber.replace("-", "");

            ArrayList<Member> matchingMembers = new ArrayList<>();
            ArrayList<Member> members = Member.readFromCSV();

            /*
            // Debug: Print all members read from CSV
            System.out.println("Members read from CSV:");
            for (Member member : members) {
                System.out.println(member);
            }
            */

            for (Member member : members) {
                //System.out.println("Comparing " + member.getPhoneNumber() + " with " + memberNumber); // Debug print
                if (member.getPhoneNumber().equals(memberNumber)) {
                    matchingMembers.add(member);
                }
            }

            if (matchingMembers.isEmpty()) {
                System.out.println("No members with phone number " + memberNumber + " found.");
                System.out.print("\nWould you like to create an account? (Y/N): ");
                Y_or_N = scanner.nextLine();
                if (Y_or_N.equalsIgnoreCase("Y")) {
                    System.out.println("Enter member details below. \n");

                    System.out.print("First Name: ");
                    String firstName = scanner.nextLine();

                    System.out.print("Last Name: ");
                    String lastName = scanner.nextLine();

                    System.out.print("(Hit enter to skip) Email: ");
                    String email = scanner.nextLine();
                    if (email.equals("")) {
                        email = null;
                    }

                    System.out.print("(Hit enter to skip) Address Line 1: ");
                    String addressLine1 = scanner.nextLine();
                    if (addressLine1.equals("")) {
                        addressLine1 = null;
                    }

                    System.out.print("(Hit enter to skip) Address Line 2: ");
                    String addressLine2 = scanner.nextLine();
                    if (addressLine2.equals("")) {
                        addressLine2 = null;
                    }

                    System.out.print("(Hit enter to skip) City: ");
                    String city = scanner.nextLine();
                    if (city.equals("")) {
                        city = null;
                    }

                    System.out.print("(Hit enter to skip) State/Province/Region: ");
                    String state_province_region = scanner.nextLine();
                    if (state_province_region.equals("")) {
                        state_province_region = null;
                    }

                    System.out.print("(Hit enter to skip) Zip: ");
                    String zip = scanner.nextLine();
                    if (zip.equals("")) {
                        zip = null;
                    }

                    System.out.print("(Hit enter to skip) Country: ");
                    String country = scanner.nextLine();
                    if (country.equals("")) {
                        country = null;
                    }

                    Member newMember = new Member(memberNumber, firstName, lastName, email, addressLine1,
                            addressLine2, city, state_province_region, zip, country);
                    memberStatus = true;

                    Member.saveToCSV(newMember);

                    System.out.println("Member added and saved to CSV file.");

                    System.out.println("\nProceed to member options?(Y/N)");
                    Y_or_N = scanner.nextLine();
                    if (Y_or_N.equalsIgnoreCase("Y")) {
                        flag = false;
                    } else {
                        System.out.println("Returning to member search.\n");
                    }

                } else {
                    System.out.println("Returning to member search.\n");
                }
            } else {
                int i = 1;
                System.out.println("Found " + matchingMembers.size() + " members with phone number " + memberNumber + ":");
                for (Member m : matchingMembers) {
                    System.out.println("#" + i + ": " + m.getFirstName() + " " + m.getLastName());
                    i++;
                }

                System.out.println("Select a member number and then hit enter: ex. 3 ");
                menu_selection = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character after nextInt()
                currentMember = matchingMembers.get(menu_selection - 1);
                //System.out.println("The current selected member is: " + currentMember);
                System.out.println("\nProceed to member options?(Y/N)");
                Y_or_N = scanner.nextLine();
                if (Y_or_N.equalsIgnoreCase("Y")) {
                    flag = false;
                } else {
                    System.out.println("Returning to member search.\n");
                }
            }
        } //END WHILE LOOP

        //MEMBER OPTIONS PORTION
        
        // Print out all members in the list
        System.out.println("\nAll members:");
        ArrayList<Member> allMembers = Member.readFromCSV();
        for (Member member : allMembers) {
            System.out.println(member);
        }

        scanner.close();
    }
}
