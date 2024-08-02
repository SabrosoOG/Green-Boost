package rewards_software_v0;

public class Member {
	
	private String phoneNumber;
	private String firstName;
	private String lastName;
	private String addressLine1 = null;
	private String addressLine2 = null;
	private String city = null;
	private String state_province_region = null;
	private String zip = null;
	private String country = null;
	
	public Member(String phoneNumber, String firstName, String lastName) {
		this.phoneNumber = phoneNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Member(String phoneNumber, String firstName, String lastName, String addressLine1, String addressLine2,
			String city, String state_province_region, String zip, String country) {
		super();
		this.phoneNumber = phoneNumber;
		this.firstName = firstName;
		this.lastName = lastName;
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

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState_province_region() {
		return state_province_region;
	}

	public void setState_province_region(String state_province_region) {
		this.state_province_region = state_province_region;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
