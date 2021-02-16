package entities;

import java.util.List;
import java.util.ArrayList;

public  class Accounts {
	private String User;
	private String Password;
	public static List <Therapist> userList;


	public Accounts(String User, String Password){
		this.Password = Password;
		this.User = User;
		this.userList = new ArrayList<>();
	}

	public String getUser() {
		return User;
	}
	
	public void setUser(String user) {
		User = user;
	}
	
	public String getPassword() {
		return Password;
	}
	
	public void setPassword(String password) {
		Password = password;
	}
	
	public List<Therapist> getUsersList() {
		return userList;
	}
	
	public void setUserList(Therapist therapist) {
		this.userList =  (List<Therapist>) userList;
	}
	
	public void newUser(Therapist user) {
		this.userList.add(user);;
	}
	
	public void Users() {
		for (Therapist user : userList) {
			
		}
	}
	
	
	
	
	
	
	
	
}

