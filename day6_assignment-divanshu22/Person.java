package com.hsbc.Day6;

import java.sql.Date;
import java.time.LocalDate;

public class Person {
	
	private int person_id;
	private String person_name;
	private String location;
	private Date dob;
	
	public Person() {
		super();
	}

	public Person(int person_id, String person_name, String location, Date dob) {
		super();
		this.person_id = person_id;
		this.person_name = person_name;
		this.location = location;
		this.dob = dob;
	}

	public int getPerson_id() {
		return person_id;
	}

	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}

	public String getPerson_name() {
		return person_name;
	}

	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	@Override
	public String toString() {
		return "Person[person_id=" + person_id + ", person_name= " + person_name + ", location= " + location + ",dob=" + dob +"]";
	}

}
