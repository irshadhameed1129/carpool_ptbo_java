package com.coresoft.springboot.CarPool.handler;


public class JsonDataHandler {
	
	private String name;
	private String address;
	private String email_id;
	private String vehicle;
	private String rating;
	private String like;
	private String dislike;
	private String phone_number;
	
	
	private String username;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getVehicle() {
		return vehicle;
	}
	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getLike() {
		return like;
	}
	public void setLike(String like) {
		this.like = like;
	}
	public String getDislike() {
		return dislike;
	}
	public void setDislike(String dislike) {
		this.dislike = dislike;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "JsonDataHandler [name=" + name + ", address=" + address + ", email_id=" + email_id + ", vehicle="
				+ vehicle + ", rating=" + rating + ", like=" + like + ", dislike=" + dislike + ", phone_number="
				+ phone_number + ", username=" + username + ", password=" + password + "]";
	}
	
	
	

}
