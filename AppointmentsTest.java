package cs320_mod3_Milestone_Tyler_Pickard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class AppointmentsTest {

	@Test
	void testAppointments() {
		Appointments Appointments = new Appointments("123456789", 22-06-2021, "Appointment for Job Shadowing");
		assertTrue(Appointments.getId().equals("123456789"));
		assertTrue(Appointments.getAppointmentDate().equals("22-06-2021"));
		assertTrue(Appointments.getDescription().equals("Appointment for Job Shadowing"));
		
		
		
		
	} // end of testTask

	
	
	@Test
	void testAppointmentsIdTooLong() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointments("123456789123456", 22-06-2021, "Appointment for Job Shadowing");
		});
	} // end of id too long test
	
	
	@Test
	void testAppointmentDateBeforeCurrentDate() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointments("123456789",  22-06-2000, "Appointment for Job Shadowing");
		});
	} // end of date before current date
	
	
	
	@Test
	void testAppointmentsDescriptionTooLong() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new appointments("123456789",  22-06-2021, "Appointment for Job Shadowingr 1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
		});
	} //end of description too long test
	
	
	
	
	
	@Test
	void testAppointmentsIdNull() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointments(null,  22-06-2021, "Appointment for Job Shadowing");
		});
	} // end of id null test
	
	
	@Test
	void testAppointmentsDateNull() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointments("123456789", null, "Appointment for Job Shadowing");
		});
	} // end of date null test
	
	
	
	@Test
	void testAppointmentsDescriptionNull() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointments("123456789",  22-06-2021, null);
		});
	} // end of description null test
	
	
	
	
	
	
	
	

} //end of class
