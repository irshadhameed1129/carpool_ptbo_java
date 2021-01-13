package com.coresoft.springboot.CarPool.handler;


public class JsonPostHandler {
	
	private String startPlace;
	private String endPlace;
	public String getStartPlace() {
		return startPlace;
	}
	public void setStartPlace(String startPlace) {
		this.startPlace = startPlace;
	}
	public String getEndPlace() {
		return endPlace;
	}
	public void setEndPlace(String endPlace) {
		this.endPlace = endPlace;
	}
	@Override
	public String toString() {
		return "JsonLoginHandler [startPlace=" + startPlace + ", endPlace=" + endPlace + "]";
	}
	
	
	
	
	

}
