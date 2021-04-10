package cs320_mod3_Milestone_Tyler_Pickard;

import cs320_mod3_Milestone_Tyler_Pickard.localDate;

public class Appointments {
	
	private String id;
	java.util.Date appointmentDate; 
	private String description;
	java.util.Date localDate = new java.util.Date();
	
	
	public Appointments(String id, int appointmentDate, String description) {
		
		
		//not null and not longer than 10 characters
		if(id == null || id.length()>10) {
			throw new IllegalArgumentException("Invalid Id");
		}
		
		//not null and not before current date
		if(appointmentDate == null ||  before(new localDate()) {
			throw new IllegalArgumentException("Invalid Date");
		}
		
		
		//not null and not longer than 50 characters
		if(description == null || description.length()>50) {
			throw new IllegalArgumentException("Invalid Description");
		}
		
		
		
		//sets variables
		this.id = id;
		this.appointmentDate = appointmentDate;
		this.description = description;
		
	}
	
	public String getId() {
		return id;     // returns id
	}
	
	public java.util.Date getAppointmentDate() {
		return appointmentDate;    //returns date
	}
	
	public String getDescription() {
		return description;   // returns description
	}
	
	
	


	
	
	
	

} //end of class
