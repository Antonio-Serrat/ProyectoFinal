package entities;

import java.util.List;

public class Therapist {
	private String Name;
	private int Id;
	private String Specialty;
	

	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		Id = id;
	}
	
	public String getSpecialty() {
		return Specialty;
	}
	
	public void setSpecialty(String specialty) {
		Specialty = specialty;
	}
	
	public static void agregarCuenta(Accounts accounts) {
		accounts = new Accounts("" , "");
	}
	
	
	
}
	
	
	

