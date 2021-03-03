package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TherapistMenu {
	private Date Agenda;
	public List<Patients> patient;
	private List<Turn> Date, turn;
	
	public TherapistMenu(int i, String string) {
		this.patient = new ArrayList<>();
		this.turn = new ArrayList<>();
		
	}


	
}
