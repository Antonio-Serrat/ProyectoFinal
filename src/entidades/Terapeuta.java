package entidades;

public class Terapeuta  {
	private String Nombre;
	private int Identificacion;
	private String Especialidad;
	private Cuentas cuenta = new Cuentas();
	
	
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
	
	public void agregarCuenta(Cuentas cuenta) {
		cuenta = new Cuentas();
	}
	
	
	
	
	
	
}
	
	
	

