package com.bbs.DB;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bbs_user")
public class userDB {
	
	@Id
	private String id;
	private String pwd;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pwd;
	}
	public void setPw(String pwd) {
		this.pwd = pwd;
	}
}