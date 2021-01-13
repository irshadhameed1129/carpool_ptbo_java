package com.coresoft.springboot.CarPool.handler;


public class JsonLoginHandler {
	
	private String pass;
	private String email;
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "JsonLoginHandler [pass=" + pass + ", email=" + email + "]";
	}
	
	
	

}
