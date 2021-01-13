package com.coresoft.springboot.CarPool.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_post")
public class ViewUserPost {
	
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="start_place")
	private String startPlace;
	
	@Column(name="end_place")
	private String endPlace;
	
	@Column(name="fname")
	private String fname;
	
	@Column(name="rate")
	private String rate;
	
	@Column(name="mobile")
	private String mobile;
	
	@Column(name="date")
	private Date  date;

	@Column(name="time")
	private String  time;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "ViewUserPost [id=" + id + ", startPlace=" + startPlace + ", endPlace=" + endPlace + ", fname=" + fname
				+ ", rate=" + rate + ", mobile=" + mobile + ", date=" + date + ", time=" + time + "]";
	}

	
	
	


}
