package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Therapist {
	private  String Name;
	private  String Specialty;
	private Date Agenda;
	public static List <Accounts> accountsList;
	public static List <Patients> patientsList;
	
	public Therapist(String name, String speciality) {
		this.Name = name;
		this.Specialty = speciality;
		this.accountsList = new ArrayList<>();
		this.patientsList = new ArrayList<>();	}

	public  String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public  String getSpecialty() {
		return Specialty;
	}
	
	public void setSpecialty(String specialty) {
		Specialty = specialty;
	}

	public  List<Accounts> getAccountsList() {
		return accountsList;
	}

	public void setAccountList(Accounts accounts) {
		this.accountsList.add(accounts);
	}

	public static List<Patients> getPatientsList() {
		return patientsList;
	}

	public static void setPatientsList(Patients patients) {
		Therapist.patientsList.add(patients);
	}

	public void newAccount(Accounts account) {
		this.accountsList.add(account);
	}
	 public void viewAccounts() {
		 for (Accounts accounts : accountsList) {
			 System.out.println("VA por ahi");
		 }
	 }
	
}
	
	
	

