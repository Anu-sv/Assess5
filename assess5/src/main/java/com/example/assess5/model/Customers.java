package com.example.assess5.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="customer")

public class Customers {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="name")
	private String name;
	@Column(name="gender")
	private char gender;
	@Column(name="age")
	private int age;
	@Column(name="preferred_name")
	private String preferredfood;
	public Customers() {
		
	}
	public Customers(String name, char gender, int age, String preferredfood) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.preferredfood = preferredfood;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public String getPreferredfood() {
		return preferredfood;
	}
	public void setPreferredfood(String preferredfood) {
		this.preferredfood = preferredfood;
	}
	
}
