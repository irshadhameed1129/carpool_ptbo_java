package com.coresoft.springboot.CarPool.handler;


public class JsonResetPasswordHandler {
	
	private String pass;
	private String email;
	private String mobile;
	
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
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
		return "JsonResetPasswordHandler [pass=" + pass + ", email=" + email + ", mobile=" + mobile + "]";
	}
	
	
	

}
