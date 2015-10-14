package com.leviblog.orm.entity;

import javax.persistence.*;

@Entity(name="manager")
@Table()
public class Manager {
	
	@Id
	@Column(name="username")
	private  String username;
	
	@Column(name="password")
	private String password;
	
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
	
}
