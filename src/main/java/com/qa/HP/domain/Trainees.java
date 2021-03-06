package com.qa.HP.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Trainees {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private int traineeID;
	private String firstName;
	private String secondName;
	private String cohort;
	private String password;

	public Trainees() {
		super();
	}

	public Trainees(int traineeID, String firstName, String secondName, String cohort, String password) {
		super();
		this.traineeID = traineeID;
		this.firstName = firstName;
		this.secondName = secondName;
		this.cohort = cohort;
		this.password = password;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setCohort(String cohort) {
		this.cohort = cohort;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// needs Hashcode and equals override for testing

}
