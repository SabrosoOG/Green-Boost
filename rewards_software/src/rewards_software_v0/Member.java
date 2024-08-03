package rewards_software_v0;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Member {
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private String email = null;
    private String addressLine1 = null;
    private String addressLine2 = null;
    private String city = null;
    private String state_province_region = null;
    private String zip = null;
    private String country = null;

    private static String memberList = "members.csv";

    public Member(String phoneNumber, String firstName, String lastName) {
        super();
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Member(String phoneNumber, String firstName, String lastName, String email, String addressLine1, String addressLine2,
                  String city, String state_province_region, String zip, String country) {
        super();
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state_province_region = state_province_region;
        this.zip = zip;
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getCity() {
        return city;
    }

    public String getState_province_region() {
        return state_province_region;
    }

    public String getZip() {
        return zip;
    }

    public String getCountry() {
        return country;
    }

    public String toCSVFormat() {
        return firstName + "," + lastName + "," + phoneNumber + "," + email + "," + addressLine1 + "," +
                addressLine2 + "," + city + "," + state_province_region + "," + zip + "," + country;
    }

    public static void saveToCSV(Member member) {
        try (FileWriter writer = new FileWriter(memberList, true)) {
            writer.write(member.toCSVFormat() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Member> readFromCSV() {
        ArrayList<Member> members = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(memberList))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] details = line.split(",");
                Member member = new Member(
                        details[2],  // phoneNumber
                        details[0],  // firstName
                        details[1],  // lastName
                        details.length > 3 ? details[3] : null, // email
                        details.length > 4 ? details[4] : null, // addressLine1
                        details.length > 5 ? details[5] : null, // addressLine2
                        details.length > 6 ? details[6] : null, // city
                        details.length > 7 ? details[7] : null, // state_province_region
                        details.length > 8 ? details[8] : null, // zip
                        details.length > 9 ? details[9] : null  // country
                );
                members.add(member);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return members;
    }

    @Override
    public String toString() {
        return "Member{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", state_province_region='" + state_province_region + '\'' +
                ", zip='" + zip + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
