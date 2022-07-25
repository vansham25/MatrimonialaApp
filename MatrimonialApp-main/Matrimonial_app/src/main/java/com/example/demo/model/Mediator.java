package com.example.demo.model;

import javax.persistence.*;

import org.hibernate.annotations.NaturalId;
@Entity
public class Mediator  {
	@Id
	@NaturalId
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	
	private String name;
	private int age;
	private String address;
	private String number;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Mediator(Long id, String name, int age, String address, String number) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.number = number;
	}
	public Mediator() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}