package AppClinicas;

import entidades.*;

	public class AppPrincipal {

		public static void main(String[] args) {
			
			Cuentas cuenta1 = new Cuentas();
			cuenta1.setUsuario("Antonio");
			cuenta1.setContraseña(123456);
			
			Terapeuta terapeuta1 = new Terapeuta();
			terapeuta1.setNombre("Antonio Serrat");
			terapeuta1.setIdentificacion(45887693);
			terapeuta1.setEspecialidad("Terapeuta Floral");
			terapeuta1.agregarCuenta(cuenta1);
		
		System.out.println(terapeuta1.getEspecialidad()+" "+terapeuta1.getNombre() +" "+terapeuta1.toString());
		
			
			
			
			
			
			
			
			
			
			
		}

		
		
		
		
		
		
		
		
}
