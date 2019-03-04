package com.sona.task1.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Forms {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String title;
	private String firstname;
	private String lastname;
	private String dateTime;
	private String comments;
	private String address;
	
	public Forms() {}

	public Forms(int id, String title, String firstname, String lastname, String dateTime, String comments,
			String address) {
		super();
		this.id = id;
		this.title = title;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dateTime = dateTime;
		this.comments = comments;
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

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Forms [id=" + id + ", title=" + title + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", dateTime=" + dateTime + ", comments=" + comments + ", address=" + address + "]";
	}

}
