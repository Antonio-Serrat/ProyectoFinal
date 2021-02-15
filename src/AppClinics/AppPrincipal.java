package AppClinicas;

import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;
import entidades.*;

	public class AppPrincipal {

		

		public static void main(String[] args) {
			Cuenta cuentas = null;
			Scanner sc = new Scanner(System.in);
	
			int opcion = -1;
			while(opcion != 0) {
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-");
				System.out.println("Bienvenido a BD.Salud");
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-");
				
				System.out.println("Ingrese 1 para crear una nueva cuenta");
				System.out.println("Ingrese 2 si ya posee una cuenta");
				System.out.println("Ingrese 0 para salir del programa");
			
			opcion = sc.nextInt();
			sc.nextLine();
		
			switch (opcion) {
			case 1: cuentas = crearCuenta(sc);
				break;
			case 2: cuentas = iniciarSesion(sc);
				break;
			}
		}
	}

		private static Cuenta crearCuenta(Scanner sc) {
			Cuenta cuentas = new Cuenta("","");
			
			System.out.println("Sea bienvenido a BD.Salud");
			System.out.println("****************************");

			System.out.println("Por favor ingrese su nombre de usuario");
			cuentas.setUsuario(sc.nextLine());
			System.out.println("Ingrese su nueva contraseña");
			cuentas.setContraseña(sc.nextLine());

			Terapeuta terapeuta = new Terapeuta(cuentas);
			cuentas.setListaUsers(terapeuta);
			return cuentas;
			
		}
		
		private static Cuenta iniciarSesion(Scanner sc) {
			
			if(Cuenta.listaUsers != null) {
				System.out.println("Que gusto volver a vernos!");
				System.out.println("********************");
				System.out.println("Ingrese su Usuario");
				String usuario = sc.nextLine();
				System.out.println("Ingrese su Contraseña");
				String contraseña = sc.nextLine();
			}
			else 
				System.out.println("Usted no posee una cuenta");
				return null;
		}
}
