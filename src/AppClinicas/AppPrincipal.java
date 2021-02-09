package AppClinicas;

import entidades.*;

	public class AppPrincipal {

		public static void main(String[] args) {
			
			Cuentas cuenta1 = new Cuentas();
		
			Terapeuta terapeuta1 = new Terapeuta();
			terapeuta1.setUsuario("Antonio");
			terapeuta1.setContraseña(123456);
			terapeuta1.setNombre("Antonio Serrat");
			terapeuta1.setIdentificacion(45887693);
			terapeuta1.setEspecialidad("Terapeuta Floral");
			
			terapeuta1.Titular();
			
			
			
			
			
			
			
			
			
			
			
		}

}
