package entidades;

import java.util.List;

public class Terapeuta {
	private String Nombre;
	private int Identificacion;
	private String Especialidad;
	private Cuenta cuentas = new Cuenta(null, null);
	
	public Terapeuta(Cuenta cuenta) {
		this.cuentas = cuenta;
	}

	public String getNombre() {
		return Nombre;
	}
	
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	public int getIdentificacion() {
		return Identificacion;
	}
	
	public void setIdentificacion(int identificacion) {
		Identificacion = identificacion;
	}
	
	public String getEspecialidad() {
		return Especialidad;
	}
	
	public void setEspecialidad(String especialidad) {
		Especialidad = especialidad;
	}
	
	public static void agregarCuenta(Cuenta cuenta) {
		cuenta = new Cuenta("" , "" );
	}
	
	
	
}
	
	
	

