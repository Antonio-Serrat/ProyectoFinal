package entities;

import java.util.List;
import java.util.ArrayList;

public  class Accounts {
	private String User;
	private String Password;
	public static List <Accounts> userList;


	public Accounts(String User, String Password){
		this.Password = Password;
		this.User = User;
		this.userList = new ArrayList<>();
	}

	public String getUser() {
		return User;
	}
	
	public void setUser(String User) {
		User = User;
	}
	
	public String getPassword() {
		return Password;
	}
	
	public void setPassword(String Password) {
		Password = Password;
	}
	
	public List<Accounts> getUsersList() {
		return userList;
	}
	
	public void setUserList(Therapist therapist) {
		this.userList =  (List<Accounts>) userList;
	}
	
	public void newUser(Accounts user) {
		this.userList.add(user);;
	}
	
	public void Users() {
		for (Accounts user : userList) {
			System.out.println(user.getUser() +" "+user.getPassword());
		}
	}
	
	
	
	
	
	
	
	
}

