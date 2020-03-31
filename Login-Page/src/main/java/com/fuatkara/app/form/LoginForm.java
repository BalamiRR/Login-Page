package com.fuatkara.app.form;

public class LoginForm {
	private String userName;
	private String password;
	
	public LoginForm() {
		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LoginForm(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginForm "+ 
				"userName=" + userName + 
				"password=" + password;
	}

}
