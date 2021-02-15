package AppClinics;

import java.util.List;
import java.util.Scanner;

import entities.*;

import java.util.InputMismatchException;

	public class AppPrincipal {

		

		public static void main(String[] args) {
			Accounts accounts = null;
			
			Scanner sc = new Scanner(System.in);
	
			int opcion = -1;
			while(opcion != 0) {
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-");
				System.out.println("Welcome to D.B. Salud");
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-");
				
				System.out.println("Ingrese 1 para crear una nueva cuenta");
				System.out.println("Ingrese 2 si ya posee una cuenta");
				System.out.println("Ingrese 0 para salir del programa");
			
			opcion = sc.nextInt();
			sc.nextLine();
		
			switch (opcion) {
			case 1: accounts = newAccount(sc);
				break;
			case 2: accounts = logIn(sc);
				break;
			}
		}
	}

		private static Accounts newAccount(Scanner sc) {
			Accounts accounts = new Accounts("","");
			
			System.out.println("Welcome to D.B. Salud");
			System.out.println("****************************");

			System.out.println("Por favor ingrese su nombre de usuario");
			accounts.setUser(sc.nextLine());
			System.out.println("Ingrese su nueva contraseña");
			accounts.setPassword(sc.nextLine());
			
			
			return accounts;
			
		}
		
		private static Accounts logIn(Scanner sc) {
			
			if(Accounts.UserList != null) {
				System.out.println("Que gusto volver a vernos!");
				System.out.println("********************");
				System.out.println("Ingrese su Usuario");
				String user = sc.nextLine();
				System.out.println("Ingrese su Contraseña");
				String password = sc.nextLine();
			}
			else 
				System.out.println("Usted no posee una cuenta");
				return null;
		}
		
		private static Therapist newTherapist(Scanner sc) {
			Therapist therapist = new Therapist();
				System.out.println("Muchas gracias por utilizar D.B. Salud");
				System.out.println("****************************");
	
				System.out.println("Por favor ingrese su nombre de usuario");
				therapist.setName(sc.nextLine());
				System.out.println("Ingrese su especialidad");
				therapist.setSpecialty(sc.nextLine());
				
				
				
			return null;
		}
}
