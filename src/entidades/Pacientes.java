package entidades;

import java.util.Date;

public class Pacientes {
	
	private String Nombre;
	private String Apellido;
	private String Email;
	private int Telefono;
	private String Direccion;
	private Date FechaNacimiento;
	private int Edad;
	
	public Pacientes(String Nombre, String Apellido, int Edad) {
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.Edad = Edad; 
	}
	
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getTelefono() {
		return Telefono;
	}
	public void setTelefono(int telefono) {
		Telefono = telefono;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public Date getFechaNacimiento() {
		return FechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	
	
	
	
	
	
}
