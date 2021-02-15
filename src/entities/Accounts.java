package entities;

import java.util.List;
import java.util.ArrayList;

public  class Accounts {
	private String User;
	private String Password;
	public static List <Therapist> UserList;


	public Accounts(String User, String Password){
		this.Password = Password;
		this.User = User;
		this.UserList = new ArrayList<>();
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
		return UserList;
	}
	
	public void setUserList(Therapist therapist) {
		this.UserList =  (List<Therapist>) UserList;
	}
	
	
	
	
	
	
	
	
	
	
}

