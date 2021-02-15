package entidades;

import java.util.List;
import java.util.ArrayList;

public  class Cuenta {
	private String Usuario;
	private String Contraseña;
	public static List <Terapeuta> listaUsers;


	public Cuenta(String Usuario, String Contraseña){
		this.Contraseña = Contraseña;
		this.Usuario = Usuario;
		this.listaUsers = new ArrayList<>();
	}

	public String getUsuario() {
		return Usuario;
	}
	
	public void setUsuario(String usuario) {
		Usuario = usuario;
	}
	
	public String getContraseña() {
		return Contraseña;
	}
	
	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}
	
	public List<Terapeuta> getListaUsers() {
		return listaUsers;
	}
	
	public void setListaUsers(Terapeuta terapeuta) {
		this.listaUsers = (List<Terapeuta>) listaUsers;
	}
	
	
	
	
	
	
	
	
	
	
}

