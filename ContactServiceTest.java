package cs320_mod3_Milestone_Tyler_Pickard;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void testAddContactToArrayList() {
		equals(new Contacts("100", "Patrick", "Mahomes", "7044441111", "KC, MIssouri")); {    
			
			
			ArrayList contactsList = new ArrayList();
		
	
	
	Contacts c1 = new Contacts("100", "Patrick", "Mahomes", "7044441111", "KC, MIssouri");
	
	contactsList.add(c1); 
	
		}
	}

	
	@Test
	void testRemoveContactFromArrayList() {
		equals(null);{
		
			ArrayList contactsList = new ArrayList();
		
			Contacts c1 = new Contacts("100", "Patrick", "Mahomes", "7044441111", "KC, MIssouri");
		contactsList.remove(c1);
		
		
		}
		
	}

	
	
	
	
}
