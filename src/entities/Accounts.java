package entities;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public  class Accounts {
	private String Username;
	private String Password;
	public static Set<Therapist> userList;
	


	public Accounts(String User, String pass){
		this.Password = pass;
		this.Username = User;
		//this.userList = new HashSet<>();
		
	}



	public String User() {
		return Username +""+ Password;
		
	}

	public String getUsername() {
		return Username;
	}
	
	public void setUsername(String username) {
		Username = username;
	}
	
	public String getPassword() {
		return Password;
	}
	
	public void setPassword(String password) {
		Password = password;
	}
	
	public Set<Therapist> getUsersList() {
		return userList;
	}
	

	public void newUser(Therapist therapist) {
		this.userList.add(therapist);
	}

	
	
	
}

