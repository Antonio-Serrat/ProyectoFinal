package dataBase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import entities.*;

public class DataBase {
	List<Accounts> usuarios = new ArrayList<>();
	Map<Integer, TherapistMenu> menu = new HashMap<>();
	Set<Therapist> therapist = new HashSet<>();
	
	public static Accounts logIn(Scanner sc) {
		DataBase db = new DataBase();
		
		
		System.out.println("****************************");
		System.out.println("Welcome to D.B. Salud");
		System.out.println("****************************");
		
		System.out.println("******Datos Personales******");
		System.out.println("Por favor ingrese su nombre ");
		String name = (sc.nextLine());
		System.out.println("Ingrese su ocupación");
		String specialty = (sc.nextLine());
		System.out.println("Ingrese su email");
		String email = (sc.nextLine());
		System.out.println("******Datos de Usuario******");
		System.out.println("Ingrese su Nombre de usuario");
		String usrName = sc.nextLine();
		System.out.println("Ingrese su Contraseña");
		String pass = sc.nextLine();
		System.out.println("****************************");
		System.out.println("****¡Log in completado!*****");
		Therapist therapist = new Therapist(name, specialty, email); 
		Accounts account = new Accounts(usrName, pass);
		account.newUser(therapist);
		//therapist.newAccount(account);
		db.setUsuarios(account);
		db.setTherapist(therapist);
	
		return null;
	}
	
	public static Accounts singIn(Scanner sc) {
		
		if(Accounts.userList != null) {
			
			System.out.println("Que gusto volver a vernos!");
			System.out.println("****************************");
			System.out.println("Ingrese su Usuario");
			String user = sc.nextLine();
			System.out.println("Ingrese su Contraseña");
			String pass = sc.nextLine();
			Accounts accountSing = new Accounts(user,pass);
			
			for(DataBase. : Accounts.userList) {
				if (accountSing.User().equals(Accounts.userList)) {
					System.out.println("JAJA estamos logrando");
				}
			}
		}
		else 
			System.out.println("Usted no posee una cuenta");
			return null;
	}

	public List<Accounts> getUsuarios() {
		return usuarios;
	}

	public  void setUsuarios(Accounts usuarios) {
		this.usuarios.add(usuarios); 
	}

	public Map<Integer, TherapistMenu> getMenu() {
		return menu;
	}

	public void setMenu(Map<Integer, TherapistMenu> menu) {
		this.menu = menu;
	}

	public Set<Therapist> getTherapist() {
		return therapist;
	}

	public void setTherapist(Therapist therapist) {
		this.therapist.add(therapist);
	}
	
	
}
