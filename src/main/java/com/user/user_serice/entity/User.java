package com.user.user_serice.entity;

import java.util.List;

public class User {
	
	private String name;
	private Long userId;
	private String mobNo;
	private List<Contact> contacts;
	
	public User(String name, Long userId, String mobNo, List<Contact> contacts) {
		super();
		this.name = name;
		this.userId = userId;
		this.mobNo = mobNo;
		this.contacts = contacts;
	}

	public User(String name, Long userId, String mobNo) {
		super();
		this.name = name;
		this.userId = userId;
		this.mobNo = mobNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	
	
}
