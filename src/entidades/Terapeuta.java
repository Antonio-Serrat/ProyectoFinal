package entidades;

public class Terapeuta extends Cuentas {
	private String Nombre;
	private int Identificacion;
	private String Especialidad;
	
	
	
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
	
	public void Titular() {
		System.out.println("El usuario de esta cuenta es "+this.getNombre()+".  Y se especializa como "+this.getEspecialidad());
	}
}
	
	
	

