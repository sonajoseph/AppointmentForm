package com.sona.task1.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="appointment")
public class Forms {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String title;
	private String fullname;
	
	private String dateTime;
	
	private String companyname;
	private String jobtitle;
	private String address;
	
	public Forms() {}

	public Forms(int id, String title, String fullname, String companyname,String jobtitle, String dateTime, 
			String address) {
		super();
		this.id = id;
		this.title = title;
		this.fullname = fullname;
		this.companyname=companyname;
		this.jobtitle=jobtitle;
		this.dateTime = dateTime;
		
		this.address = address;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	

	

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getJobtitle() {
		return jobtitle;
	}

	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Forms [id=" + id + ", title=" + title + ", fullname=" + fullname + ", dateTime=" + dateTime
				+ ", companyname=" + companyname + ", jobtitle=" + jobtitle + ", address=" + address + "]";
	}

	

}
