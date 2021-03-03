package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Therapist {
	private  String Name;
	private  String Specialty;
	private String email;
	private String tlf;
	private String DNI;
	private Date Agenda;
	//public static List <Accounts> accountsList;
	public static List <Patients> patientsList;
	
	public Therapist(String name, String speciality, String email,String dni, String tlf) {
		this.Name = name;
		this.Specialty = speciality;
		this.email = email;
		this.DNI = dni;
		this.tlf = tlf;
		//this.accountsList = new ArrayList<>();
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


	public static List<Patients> getPatientsList() {
		return patientsList;
	}

	public static void setPatientsList(Patients patients) {
		Therapist.patientsList.add(patients);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	//public  List<Accounts> getAccountsList() {
	//return accountsList;
	//}
	
	//public void setAccountList(Accounts accounts) {
	//	this.accountsList.add(accounts);
	//}
//	public void newAccount(Accounts account) {
//		this.accountsList.add(account);
//	}

	
}
	
	
	

