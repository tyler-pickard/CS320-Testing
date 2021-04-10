package cs320_mod3_Milestone_Tyler_Pickard;

import java.util.ArrayList;

public class ContactService extends Contacts{

	public ContactService(String id, String firstName, String lastName, String phoneNumber, String address) {
		super(id, firstName, lastName, phoneNumber, address);
		// TODO Auto-generated constructor stub
	
	
	ArrayList contactsList = new ArrayList();
	
	
	Contacts c1 = new Contacts("100", "Patrick", "Mahomes", "7044441111", "KC, MIssouri");
	
	Contacts c2 = new Contacts(getId(), getFirstName(), getLastName(), getphoneNumber(), getAddress());
	
	Contacts c3 = new Contacts(getId(), getFirstName(), getLastName(), getphoneNumber(), getAddress());
	
	Contacts c4 = new Contacts(getId(), getFirstName(), getLastName(), getphoneNumber(), getAddress());
	
	
	contactsList.add(c1); //  should be used to add a contact to arraylist
	
	contactsList.add(c2); //    should be used to add contact to arraylist
	
	contactsList.remove(c1); //Removes a contact
	
	
	
	
	
	}
	
} //end of class


