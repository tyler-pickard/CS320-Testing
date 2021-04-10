package cs320_mod3_Milestone_Tyler_Pickard;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TaskServiceTest {

	
	@Test
	void testAddTaskToArrayList() {
		equals(new Task("100", "Reading", "Read the Chapter")); {    
			
			
			ArrayList taskList = new ArrayList();
		
	
	
	Task t1 = new Task("100", "Reading", "Read the Chapter");
	
	taskList.add(t1); 
	
		}
	}

	
	@Test
	void testRemoveTaskFromArrayList() {
		equals(null);{
		
			ArrayList taskList = new ArrayList();
		
			Task t1 = new Task("100", "Reading", "Read the Chapter");
		taskList.remove(t1);
		
		
		}
		
	}
	
	
	
	

}
