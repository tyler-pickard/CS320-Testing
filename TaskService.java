package cs320_mod3_Milestone_Tyler_Pickard;


	
	
	import java.util.ArrayList;

	public class TaskService extends Task{

		public TaskService(String id, String name, String description) {
			super(id, name, description);
			// TODO Auto-generated constructor stub
		
		
		ArrayList taskList = new ArrayList();
		
		
		Task t1 = new Task("100", "Reading", "Reading the Chapter");
		
		Task t2 = new Task(getId(), getName(), getDescription());
		
		Task t3 = new Task(getId(), getName(), getDescription());
		
		Task t4 = new Task(getId(), getName(), getDescription());
		
		
		taskList.add(t1); //  should be used to add a task to arraylist
		
		taskList.add(t2); //    should be used to add task to arraylist
		
		taskList.remove(t1); //Removes a task
		

		
		
		}
		
	} //end of class
	

	
	


