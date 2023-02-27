package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class User {

	private int id;
	private String name;
	private String email;
	private String username;
	private Double fine;
	private String role;
	private List<Issue> issues = new ArrayList<>();
	public int getId() {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Double getFine() {
		return fine;
	}
	public void setFine(Double fine) {
		this.fine = fine;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public User(int id, String name, String email, String username, Double fine, String role) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.username = username;
		this.fine = fine;
		this.role = role;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

}
