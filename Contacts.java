package cs320_mod3_Milestone_Tyler_Pickard;

public class Contacts {
	
	
	private String id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	public Contacts(String id, String firstName, String lastName, String phoneNumber, String address) {
		
		
		//not null and not longer than 10 characters
		if(id == null || id.length()>10) {
			throw new IllegalArgumentException("Invalid Id");
		}
		
		//not null and not longer than 10 characters
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		
		
		//not null and not longer than 10 characters
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		
		// not null and exactly 10 characters
		if(phoneNumber == null || phoneNumber.length()>10 || phoneNumber.length()<10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		
		// not null or more than 30 characters
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		
		//sets variables
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		
	}
	
	public String getId() {
		return id;     // returns id
	}
	
	public String getFirstName() {
		return firstName;    //returns first name
	}
	
	public String getLastName() {
		return lastName;   // returns last name
	}
	
	
	public String getphoneNumber() {
		return phoneNumber;    //returns phone number
	}
	
	public String getAddress() {
		return address;   // returns address
	}
	
	//String contact (getId, firstName, lastName, phoneNumber, address);

}
