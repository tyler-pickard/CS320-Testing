package cs320_mod3_Milestone_Tyler_Pickard;

public class Task {
	
	
	private String id;
	private String name;
	private String description;
	
	
	public Task(String id, String name, String description) {
		
		
		//not null and not longer than 10 characters
		if(id == null || id.length()>10) {
			throw new IllegalArgumentException("Invalid Id");
		}
		
		//not null and not longer than 20 characters
		if(name == null || name.length()>20) {
			throw new IllegalArgumentException("Invalid Name");
		}
		
		
		//not null and not longer than 50 characters
		if(description == null || description.length()>50) {
			throw new IllegalArgumentException("Invalid Description");
		}
		
		
		
		//sets variables
		this.id = id;
		this.name = name;
		this.description = description;
		
	}
	
	public String getId() {
		return id;     // returns id
	}
	
	public String getName() {
		return name;    //returns name
	}
	
	public String getDescription() {
		return description;   // returns description
	}
	
	
	


	
	
	
} //end of class
