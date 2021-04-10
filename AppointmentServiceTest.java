package cs320_mod3_Milestone_Tyler_Pickard;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import appointmentServiceCS320.Appointments;

class AppointmentServiceTest {

	@Test
	void testAddAppointmentToArrayList() {
		equals(new Appointments("100", 12-08-2021, "One on One")); {    
			
			
			ArrayList appointmentList = new ArrayList();
		
	
	
	Appointments a1 = new Appointments("100", 12-08-2021, "One on One");
	
	appointmentList.add(a1); 
	
		}
	}

	
	@Test
	void testRemoveAppointmentFromArrayList() {
		equals(null);{
		
			ArrayList appointmentList = new ArrayList();
		
			Appointments a1 = new Appointments("100", 12-08-2021, "One on One");
		appointmentList.remove(a1);
		
		
		}
		
	}
	
	
	
	

} //end of test
