package com.phucng.beans;

public class account {
	private int id;
	private String username;
	private String password;
	private String full_name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public account(int id, String username, String password, String full_name) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.full_name = full_name;
	}
	
	
}
