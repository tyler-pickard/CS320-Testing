package cs320_mod3_Milestone_Tyler_Pickard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskTest {

	
	@Test
	void testContacts() {
		Task task = new Task("123456789", "Reading", "Reading the Chapter");
		assertTrue(task.getId().equals("123456789"));
		assertTrue(task.getName().equals("Reading"));
		assertTrue(task.getDescription().equals("Reading the Chapter"));
		
		
		
		
	} // end of testTask

	
	
	@Test
	void testTaskIdTooLong() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("123456789123456", "Reading", "Reading the Chapter");
		});
	} // end of id too long test
	
	
	@Test
	void testTaskNameTooLong() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("123456789", "ReadingWriting ReadingWriting REading Writing", "Reading the Chapter");
		});
	} // end of name too long
	
	
	
	@Test
	void testTaskDescriptionTooLong() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("123456789", "Reading", "Reading the Chapter 1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
		});
	} //end of description too long test
	
	
	
	
	
	@Test
	void testTaskIdNull() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, "Reading", "Reading the Chapter");
		});
	} // end of id null test
	
	
	@Test
	void testTaskNameNull() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("123456789", null, "Reading the Chapter");
		});
	} // end of name null test
	
	
	
	@Test
	void testTaskDescriptionNull() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("123456789", "Reading", null);
		});
	} // end of description null test
	
	
	
	
	
	
	
	

} //end of class
