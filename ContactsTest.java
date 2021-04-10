package cs320_mod3_Milestone_Tyler_Pickard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactsTest {

	@Test
	void testContacts() {
		Contacts contacts = new Contacts("123456789", "Tyler", "Pickard", "7041111111", "Charlotte, NC" );
		assertTrue(contacts.getId().equals("123456789"));
		assertTrue(contacts.getFirstName().equals("Tyler"));
		assertTrue(contacts.getLastName().equals("Pickard"));
		assertTrue(contacts.getphoneNumber().equals("7041111111"));
		assertTrue(contacts.getAddress().equals("Charlotte, NC"));
		
		
		
	} // end of testContacts

	
	
	@Test
	void testContactsIdTooLong() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contacts("123456789123456", "Tyler", "Pickard", "7041111111", "Charlotte, NC");
		});
	} // end of id too long test
	
	
	@Test
	void testContactsFirstNameTooLong() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contacts("123456789", "TylerTylerTyler", "Pickard", "7041111111", "Charlotte, NC");
		});
	} // end of first name too long
	
	
	
	@Test
	void testContactsLastNameTooLong() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contacts("123456789", "Tyler", "PickardPickard", "7041111111", "Charlotte, NC");
		});
	} //end of last name too long test
	
	
	
	
	@Test
	void testContactsPhoneNumberTooLong() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contacts("123456789", "Tyler", "Pickard", "704111111122", "Charlotte, NC");
		});
	} // end of phone number too long test
	
	
	
	@Test
	void testContactsPhoneNumberTooShort() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contacts("123456789", "Tyler", "Pickard", "704111", "Charlotte, NC");
		});
	} // end of phone number too short test
	
	
	
	@Test
	void testContactsAddressTooLong() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contacts("123456789", "Tyler", "Pickard", "7041111111", "Charlotte, NC11111111111111111111111111111111111111111111111111111111111111111111111");
		});
	} // end of address too long test
	
	
	
	
	
	@Test
	void testContactsIdNull() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contacts(null, "Tyler", "Pickard", "7041111111", "Charlotte, NC");
		});
	} // end of id null test
	
	
	@Test
	void testContactsFirstNameNull() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contacts("123456789", null, "Pickard", "7041111111", "Charlotte, NC");
		});
	} // end of first name null test
	
	
	
	@Test
	void testContactsLastNameNull() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contacts("123456789", "Tyler", null, "7041111111", "Charlotte, NC");
		});
	} // end of last name null test
	
	
	
	@Test
	void testContactsPhoneNumberNull() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contacts("123456789", "Tyler", "Pickard", null, "Charlotte, NC");
		});
	} // end of phone number null test
	
	
	@Test
	void testContactsAddressNull() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contacts("123456789", "Tyler", "Pickard", "7041111111", null);
		});
	} // end of address null test
	
	
	
	
} // end of test class
