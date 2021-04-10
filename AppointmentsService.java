package cs320_mod3_Milestone_Tyler_Pickard;

import java.util.ArrayList;

import appointmentServiceCS320.Appointments;

public class AppointmentService extends Appointments{

	


		public AppointmentService(String id, java.util.Date appointmentDate, String description) {
			super(id, appointmentDate, description);
			// TODO Auto-generated constructor stub
		
		
		ArrayList appointmentList = new ArrayList();
		
		
		Appointments a1 = new Appointments("100", 08-12-2021, "One on One");
		
		Appointments a2 = new Appointments(getId(), getAppointmentDate(), getDescription());
		
		Appointments a3 = new Appointments(getId(), getAppointmentDate(), getDescription());
		
		Appointments a4 = new Appointments(getId(), getAppointmentDate(), getDescription());
		
		
		appointmentList.add(a1); //  should be used to add an appointment to arraylist
		
		appointmentList.add(a2); //    should be used to add appointment to arraylist
		
		appointmentList.remove(a1); //Removes an appointment or can be used to remove and update 
		

		
		
		}
		
	} //end of class
	

	
	

	
	

