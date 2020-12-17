package com.sw409.Patient.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "patients")
public class Patient {
	String name;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String gender;
	String age;
	String height;
	String weight;
	String allergy;
	String cond;
	String details;
	
	
	






	public Patient(String name, Integer id, String gender, String age, String height, String weight, String allergy,
			String cond, String details) {
		super();
		this.name = name;
		this.id = id;
		this.gender = gender;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.allergy = allergy;
		this.cond = cond;
		this.details = details;
	}






	public Patient() {
		
	}



	public String getHeight() {
		return height;
	}



	public void setHeight(String height) {
		this.height = height;
	}



	public String getWeight() {
		return weight;
	}




	public void setWeight(String weight) {
		this.weight = weight;
	}


	public String getDetails() {
		return details;
	}



	public void setDetails(String details) {
		this.details = details;
	}




	public String getAllergy() {
		return allergy;
	}


	public void setAllergy(String allergy) {
		this.allergy = allergy;
	}


	public String getCond() {
		return cond;
	}


	public void setCond(String cond) {
		this.cond = cond;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	
	
	

}

